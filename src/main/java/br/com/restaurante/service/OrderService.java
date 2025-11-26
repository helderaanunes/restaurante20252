package br.com.restaurante.service;

import br.com.restaurante.entity.OrderStatus;
import br.com.restaurante.entity.Pedido;
import br.com.restaurante.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    // LISTAR PEDIDOS PENDENTES
    public List<Pedido> getPendingOrders() {
        return repo.findByStatusPedidoOrderByIdAsc(OrderStatus.PENDING);
    }

    // LISTAR PEDIDOS CONCLUÍDOS
    public List<Pedido> getCompletedOrders() {
        return repo.findByStatusPedidoOrderByIdAsc(OrderStatus.COMPLETED);
    }

    // SALVAR PEDIDO NOVO
    public Pedido salvar(Pedido pedido) {
        return repo.save(pedido);
    }

    // MARCAR COMO CONCLUÍDO
    @Transactional
    public Pedido markAsCompleted(Long id) {
        Pedido order = repo.findById(id).orElseThrow();
        order.setStatusPedido(OrderStatus.COMPLETED);
        return repo.save(order);
    }
}

