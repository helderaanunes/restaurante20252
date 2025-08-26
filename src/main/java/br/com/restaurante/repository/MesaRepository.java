package br.com.restaurante.repository;

import br.com.restaurante.entity.Mesa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesaRepository
        extends CrudRepository<Mesa,Long> {
}
