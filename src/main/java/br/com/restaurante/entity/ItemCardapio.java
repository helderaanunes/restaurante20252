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
}
