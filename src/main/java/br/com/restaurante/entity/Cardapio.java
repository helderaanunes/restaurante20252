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

    public LocalDate getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(LocalDate inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public boolean isExibirNoAltoAtendimento() {
        return exibirNoAltoAtendimento;
    }

    public void setExibirNoAltoAtendimento(boolean exibirNoAltoAtendimento) {
        this.exibirNoAltoAtendimento = exibirNoAltoAtendimento;
    }

    public LocalDate getFimVigencia() {
        return fimVigencia;
    }

    public void setFimVigencia(LocalDate fimVigencia) {
        this.fimVigencia = fimVigencia;
    }

    public Boolean getVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(Boolean visibilidade) {
        this.visibilidade = visibilidade;
    }
}
