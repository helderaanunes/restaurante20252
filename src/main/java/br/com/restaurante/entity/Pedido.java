package br.com.restaurante.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Entity
@Data
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoAtendimento;

    @Enumerated(EnumType.STRING)
    private OrderStatus statusPedido;

    private String origem;
    private Double subtotal;
    private Double total;

    @ElementCollection
    private List<OrderItem> itens;

    private Instant criadoEm;
    private Instant atualizadoEm;
}
