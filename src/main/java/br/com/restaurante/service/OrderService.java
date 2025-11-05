package br.com.restaurante.service;

import br.com.restaurante.entity.OrderStatus;
import br.com.restaurante.entity.Pedido;
import br.com.restaurante.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public List<Pedido> getPendingOrders() {
        return repo.findByStatusOrderByCreatedAtAsc(OrderStatus.PENDING);
    }

    @Transactional
    public Pedido markAsCompleted(Long id) {
        Pedido order = repo.findById(id).orElseThrow();
        order.setStatusPedido(OrderStatus.COMPLETED);
        Pedido saved = repo.save(order);
        return saved;
    }
}
