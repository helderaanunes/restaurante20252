package br.com.restaurante.repository;

import br.com.restaurante.entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

    /**
     * Lucro diário (group by date).
     * Usamos FUNCTION('DATE', p.dataHora) para delegar a extração de data ao banco.
     * Retorna List<Object[]> onde:
     *  - index 0 = label (data)
     *  - index 1 = soma(valor)
     *
     * Se houver problemas com FUNCTION no seu ambiente, troque para nativeQuery=true e SQL MySQL:
     * SELECT DATE(data_hora) as dia, SUM(valor) as total FROM pagamento GROUP BY DATE(data_hora)
     */
    @Query("SELECT FUNCTION('DATE', p.dataHora), SUM(p.valor) " +
            "FROM Pagamento p " +
            "WHERE p.status = 'CONCLUIDO' " +   // apenas pagamentos concluídos — ajuste conforme sua regra
            "GROUP BY FUNCTION('DATE', p.dataHora) " +
            "ORDER BY FUNCTION('DATE', p.dataHora)")
    List<Object[]> lucroDiario();

    /**
     * Lucro semanal (group by YEARWEEK).
     * YEARWEEK(p.dataHora,1) -> semana ISO (segunda-feira como primeiro dia).
     * OBS: nem todos os bancos expõem YEARWEEK via JPQL, por isso usamos FUNCTION.
     */
    @Query("SELECT FUNCTION('YEARWEEK', p.dataHora, 1), SUM(p.valor) " +
            "FROM Pagamento p " +
            "WHERE p.status = 'CONCLUIDO' " +
            "GROUP BY FUNCTION('YEARWEEK', p.dataHora, 1) " +
            "ORDER BY FUNCTION('YEARWEEK', p.dataHora, 1)")
    List<Object[]> lucroSemanal();

    /**
     * Lucro mensal (agrupa por ano-mês).
     * DATE_FORMAT equivalente via FUNCTION: aqui pedimos '%Y-%m' para ter '2025-11'.
     */
    @Query("SELECT FUNCTION('DATE_FORMAT', p.dataHora, '%Y-%m'), SUM(p.valor) " +
            "FROM Pagamento p " +
            "WHERE p.status = 'CONCLUIDO' " +
            "GROUP BY FUNCTION('DATE_FORMAT', p.dataHora, '%Y-%m') " +
            "ORDER BY FUNCTION('DATE_FORMAT', p.dataHora, '%Y-%m')")
    List<Object[]> lucroMensal();

    /**
     * Lucro por intervalo de datas (agrupado por dia).
     * Recebe LocalDateTime inicio/fim para considerar horário também.
     */
    @Query("SELECT FUNCTION('DATE', p.dataHora), SUM(p.valor) " +
            "FROM Pagamento p " +
            "WHERE p.status = 'CONCLUIDO' AND p.dataHora BETWEEN :inicio AND :fim " +
            "GROUP BY FUNCTION('DATE', p.dataHora) " +
            "ORDER BY FUNCTION('DATE', p.dataHora)")
    List<Object[]> lucroPorIntervalo(LocalDateTime inicio, LocalDateTime fim);
}
