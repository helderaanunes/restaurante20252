package br.com.restaurante.repository;

import br.com.restaurante.entity.ItemCardapio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCardapioRepository extends CrudRepository<ItemCardapio, Long> {
}
