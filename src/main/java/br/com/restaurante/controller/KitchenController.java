package br.com.restaurante.controller;

import br.com.restaurante.entity.Pedido;
import br.com.restaurante.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class KitchenController {
    private final OrderService service;

    public KitchenController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/pending")
    public List<Pedido> getPending() {
        return service.getPendingOrders();
    }

    @PutMapping("/{id}/complete")
    public ResponseEntity<Pedido> complete(@PathVariable Long id) {
        return ResponseEntity.ok(service.markAsCompleted(id));
    }
}

