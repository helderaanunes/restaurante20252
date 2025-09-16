package br.com.restaurante.repository;

import br.com.restaurante.entity.Unidade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UnidadeRepository extends CrudRepository <Unidade,Long> {
}

