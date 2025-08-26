package br.com.restaurante.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

import java.time.Instant;

@Entity
@Data

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String TipoAtendimento;
    private String StatusPedido;
    private String Origem;
    private Double Subtotal;
    private Double Total;
    private Instant CriadoEM;
    private Instant AtualizadoEm;

}
