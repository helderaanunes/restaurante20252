package br.com.restaurante.repository;

import br.com.restaurante.entity.Atendimento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendimentoRepository extends CrudRepository<Atendimento,Long> {

}
