package br.com.restaurante.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ingredienteRepository
    extends CrudRepository<ingrediente,long>{
}
