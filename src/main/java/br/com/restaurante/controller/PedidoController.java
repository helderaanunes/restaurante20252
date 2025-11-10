package br.com.restaurante.controller;

import br.com.restaurante.entity.Pedido;
import br.com.restaurante.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    // Endpoint para criar um pedido (POST)
    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return pedidoService.salvarPedido(pedido);
    }

    // Endpoint para buscar um pedido pelo ID (GET)
    @GetMapping("/{id}")
    public Pedido buscarPedido(@PathVariable Long id) {
        return pedidoService.buscarPorId(id);
    }

    // Endpoint para listar todos os pedidos (GET)
    @GetMapping
    public Iterable<Pedido> listarPedidos() {
        return pedidoService.listarTodos();
    }
}
