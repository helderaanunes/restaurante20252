package br.com.restaurante.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Data
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant criadaEm;
    private Instant aprovadaEm;
    private double total;
}

