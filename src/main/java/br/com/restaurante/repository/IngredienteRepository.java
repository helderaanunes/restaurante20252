package br.com.restaurante.repository;

import br.com.restaurante.entity.Ingrediente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredienteRepository extends CrudRepository<Ingrediente,Long> {
}


