package br.com.restaurante.controller;

import br.com.restaurante.entity.Pedido;
import br.com.restaurante.service.PedidoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    // Pedidos prontos
    @GetMapping("/prontos")
    public List<Pedido> listarPedidosProntos() {
        return pedidoService.listarPedidosProntos();
    }

    // Pedidos em preparação
    @GetMapping("/preparando")
    public List<Pedido> listarPedidosEmPreparacao() {
        return pedidoService.listarPedidosEmPreparacao();
    }
}
