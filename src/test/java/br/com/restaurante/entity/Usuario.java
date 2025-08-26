package br.com.restaurante.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

@Table (name = "TB_USUARIO")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false)
    private String nome;
    @Column (nullable = false, unique = true)
    private String email;
    private String senha;
    private boolean ativo;


}
