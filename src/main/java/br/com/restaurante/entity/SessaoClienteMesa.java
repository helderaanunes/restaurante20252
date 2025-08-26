package br.com.restaurante.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class SessaoClienteMesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant inicio;
    private Instant ultimoAcesso;
    private Instant expiraEm;
    private StatusSessao status;
    private  String deviceId;
    private  String ip;
    private  StringuserAgent;
    private BigDecimal limiteValor;
    private Integer limiteItens;


