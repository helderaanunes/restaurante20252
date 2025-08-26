package br.com.restaurante.repository;

import br.com.restaurante.entity.CategoriaItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaItemRepository extends CrudRepository<CategoriaItem, Long> {
}
