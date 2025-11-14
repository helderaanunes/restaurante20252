package br.com.restaurante.service;

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

    public List<Pedido> listarPedidosProntos() {
        return pedidoRepository.buscarPedidosProntos();
    }
}





