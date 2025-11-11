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
    private String tipoAtendimento;
    private OrderStatus statusPedido;
    private String origem;
    private Double subtotal;
    private Double total;
    private Instant criadoEM;
    private Instant atualizadoEm;

    public OrderStatus getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(OrderStatus statusPedido) {
        statusPedido = statusPedido;
    }

    public Instant getAtualizadoEm() {
        return atualizadoEm;
    }

    public void setAtualizadoEm(Instant atualizadoEm) {
        atualizadoEm = atualizadoEm;
    }

    public Instant getCriadoEM() {
        return criadoEM;
    }

    public void setCriadoEM(Instant criadoEM) {
        criadoEM = criadoEM;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        origem = origem;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        subtotal = subtotal;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        tipoAtendimento = tipoAtendimento;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        total = total;
    }
}
