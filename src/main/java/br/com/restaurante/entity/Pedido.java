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
    private OrderStatus StatusPedido;
    private String Origem;
    private Double Subtotal;
    private Double Total;
    private Instant CriadoEM;
    private Instant AtualizadoEm;

    public OrderStatus getStatusPedido() {
        return StatusPedido;
    }

    public void setStatusPedido(OrderStatus statusPedido) {
        StatusPedido = statusPedido;
    }

    public Instant getAtualizadoEm() {
        return AtualizadoEm;
    }

    public void setAtualizadoEm(Instant atualizadoEm) {
        AtualizadoEm = atualizadoEm;
    }

    public Instant getCriadoEM() {
        return CriadoEM;
    }

    public void setCriadoEM(Instant criadoEM) {
        CriadoEM = criadoEM;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigem() {
        return Origem;
    }

    public void setOrigem(String origem) {
        Origem = origem;
    }

    public Double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(Double subtotal) {
        Subtotal = subtotal;
    }

    public String getTipoAtendimento() {
        return TipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        TipoAtendimento = tipoAtendimento;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double total) {
        Total = total;
    }
}
