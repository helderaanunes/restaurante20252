package br.com.restaurante.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.Instant;

@Entity
@Data
public class ChaveAcessoMesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private Instant criadoEm;
    private Instant expiraEm;
    private boolean ativo;
    private String escopo;
    private String ipCriacao;
    private String userAgentCriacao;
}
