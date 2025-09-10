package br.com.restaurante.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.time.LocalDate;

@Entity
@Data
public class Cardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false)
    private String nome;
    @Column (nullable = false)
    private LocalDate inicioVigencia;
    private LocalDate fimVigencia;
    @Column (nullable = false)
    private boolean exibirNoAltoAtendimento;
    @Column (nullable = false)
    private Boolean visibilidade;

}
