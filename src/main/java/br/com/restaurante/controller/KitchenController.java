package br.com.restaurante.controller;

import br.com.restaurante.entity.Pedido;
import br.com.restaurante.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class KitchenController {

    @Autowired
    private OrderService service;

//    @GetMapping("/pending")
//    public List<Pedido> getPending() {
//        return service.getPendingOrders();
//    }

    @PutMapping("/{id}/complete")
    public ResponseEntity<Pedido> complete(@PathVariable Long id) {
        return ResponseEntity.ok(service.markAsCompleted(id));
    }
}

