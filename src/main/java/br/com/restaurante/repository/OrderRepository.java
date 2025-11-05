package br.com.restaurante.repository;

import br.com.restaurante.entity.OrderStatus;
import br.com.restaurante.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByStatusOrderByCreatedAtAsc(OrderStatus status);
}

