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

    @GetMapping("/prontos")
    public List<Pedido> listarPedidosProntos() {
        return pedidoService.listarPedidosProntos();
    }
}

