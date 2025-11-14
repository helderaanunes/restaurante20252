package br.com.restaurante.service;

import br.com.restaurante.entity.Pedido;
import br.com.restaurante.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
=======
import java.util.Optional;

>>>>>>> 980b82a0165c897e4518bb6d5d4744861386172f
@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

<<<<<<< HEAD
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
=======
    public Pedido salvar(Pedido novo) {
        return pedidoRepository.save(novo);
    }

    public Iterable<Pedido> listar() {
        return pedidoRepository.findAll();
    }

    public Pedido atualizar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public void remover(Long id) {
        pedidoRepository.deleteById(id);
    }

    public Optional<Pedido> pegarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

>>>>>>> 980b82a0165c897e4518bb6d5d4744861386172f
}

