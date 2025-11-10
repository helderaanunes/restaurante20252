package br.com.restaurante.service;

import br.com.restaurante.entity.Pedido;
import br.com.restaurante.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    // Método para salvar um pedido
    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // Método para buscar um pedido pelo ID
    public Pedido buscarPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    // Método para listar todos os pedidos
    public Iterable<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }
}

