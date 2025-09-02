package br.com.restaurante.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Unidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false)
    private String nome;


    public Long getId(){
        return id;
    }
    public void setId(Long ind){
        this.id=id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
}
