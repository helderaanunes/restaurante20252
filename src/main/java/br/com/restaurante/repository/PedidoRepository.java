package br.com.restaurante.repository;

import br.com.restaurante.entity.ItemCardapio;
import br.com.restaurante.entity.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long>

    {
}

