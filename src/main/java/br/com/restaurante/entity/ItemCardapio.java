package br.com.restaurante.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ItemCardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String descricaoCurta;
    private double preco;
    private boolean disponivel;
    private boolean exibirNoAutoatendimento;
    private int tempoPreparoEstimado;
    private int limitePorPedido;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }

    public void setDescricaoCurta(String descricaoCurta) {
        this.descricaoCurta = descricaoCurta;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isExibirNoAutoatendimento() {
        return exibirNoAutoatendimento;
    }

    public void setExibirNoAutoatendimento(boolean exibirNoAutoatendimento) {
        this.exibirNoAutoatendimento = exibirNoAutoatendimento;
    }

    public int getTempoPreparoEstimado() {
        return tempoPreparoEstimado;
    }

    public void setTempoPreparoEstimado(int tempoPreparoEstimado) {
        this.tempoPreparoEstimado = tempoPreparoEstimado;
    }

    public int getLimitePorPedido() {
        return limitePorPedido;
    }

    public void setLimitePorPedido(int limitePorPedido) {
        this.limitePorPedido = limitePorPedido;
    }
}
