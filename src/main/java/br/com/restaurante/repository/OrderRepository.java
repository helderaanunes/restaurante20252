package br.com.restaurante.repository;

import br.com.restaurante.entity.OrderStatus;
import br.com.restaurante.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Pedido, Long> {

    // Buscar pedidos por status e ordenar pelo ID
    List<Pedido> findByStatusPedidoOrderByIdAsc(OrderStatus status);
}
