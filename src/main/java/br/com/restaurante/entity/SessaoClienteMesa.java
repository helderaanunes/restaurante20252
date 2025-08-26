package br.com.restaurante.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class SessaoClienteMesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime inicio;
    private LocalDateTime ultimoAcesso;
    private LocalDateTime expiraEm;
    private Long status;
    private String deviceId;
    private String ip;
    private String userAgent;
    private BigDecimal limiteValor;
    private Integer limiteItens;
}


