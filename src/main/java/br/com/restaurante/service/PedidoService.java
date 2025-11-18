package br.com.restaurante.service;

import br.com.restaurante.entity.OrderStatus;
import br.com.restaurante.entity.Pedido;
import br.com.restaurante.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    // Pedidos prontos (COMPLETED)
    public List<Pedido> listarPedidosProntos() {
        return pedidoRepository.findByStatusPedidoOrderByIdAsc(OrderStatus.COMPLETED);
    }

    // Pedidos em preparação (PREPARING)
    public List<Pedido> listarPedidosEmPreparacao() {
        return pedidoRepository.findByStatusPedidoOrderByIdAsc(OrderStatus.PENDING);
    }
}
