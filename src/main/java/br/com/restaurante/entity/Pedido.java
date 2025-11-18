package br.com.restaurante.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

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

    private Instant criadoEm;
    private Instant atualizadoEm;
}
