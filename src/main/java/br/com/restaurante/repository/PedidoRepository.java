package br.com.restaurante.repository;

import br.com.restaurante.entity.ItemCardapio;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository {
    PedidoRepository extends CrudRepository<Pedido, Long>

    {
}

