package br.com.restaurante.repository;

import br.com.restaurante.entity.Pedido;
import br.com.restaurante.entity.OrderStatus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {

    // ------------------------------------------
    // 1) DERIVED QUERY (Spring interpreta pelo nome)
    // ------------------------------------------
    List<Pedido> findByStatusPedidoOrderByIdAsc(OrderStatus status);


    // ------------------------------------------
    // 2) JPQL / HQL (orientado à entidade)
    // ------------------------------------------
    @Query("SELECT p FROM Pedido p WHERE p.statusPedido = :status ORDER BY p.id ASC")
    List<Pedido> buscarPorStatusHql(OrderStatus status);


    // ------------------------------------------
    // 3) NATIVE QUERY (SQL real)
    // ------------------------------------------
    @Query(
            value = "SELECT * FROM pedido WHERE status_pedido = :status ORDER BY id ASC",
            nativeQuery = true
    )
    List<Pedido> buscarPorStatusNative(String status);

}
