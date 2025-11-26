package br.com.restaurante.controller;

import br.com.restaurante.entity.OrderStatus;
import br.com.restaurante.entity.Pedido;
import br.com.restaurante.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class KitchenController {

    @Autowired
    private OrderService service;

    @GetMapping("/pending")
    public List<Pedido> getPending() {
        return service.getPendingOrders();
    }

    @GetMapping("/completed")
    public List<Pedido> getCompleted() {
        return service.getCompletedOrders();
    }

    @PutMapping("/{id}/complete")
    public ResponseEntity<Pedido> complete(@PathVariable Long id) {
        return ResponseEntity.ok(service.markAsCompleted(id));
    }

    @PostMapping
    public ResponseEntity<Pedido> criarPedido(@RequestBody Pedido pedido) {
        pedido.setStatusPedido(OrderStatus.PENDING);
        pedido.setCriadoEm(Instant.now());
        pedido.setAtualizadoEm(Instant.now());
        Pedido salvo = service.salvar(pedido);
        return ResponseEntity.ok(salvo);
    }
}


