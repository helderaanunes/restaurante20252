package br.com.restaurante.repository;

import br.com.restaurante.entity.SessaoClienteMesa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessaoClienteMesaRepository extends CrudRepository <SessaoClienteMesa,Long> {
}
