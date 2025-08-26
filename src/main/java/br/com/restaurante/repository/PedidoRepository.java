package br.com.restaurante.repository;

import br.com.restaurante.entity.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository
        extends CrudRepository <Pedido, Long> {
}