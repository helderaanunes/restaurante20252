package br.com.restaurante.service;

import br.com.restaurante.entity.Pedido;
import br.com.restaurante.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

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
}
