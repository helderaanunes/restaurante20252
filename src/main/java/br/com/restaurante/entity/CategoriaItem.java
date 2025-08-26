package br.com.restaurante.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CategoriaItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column (nullable = false)
    private String nome;
    private Integer ordem;
}
