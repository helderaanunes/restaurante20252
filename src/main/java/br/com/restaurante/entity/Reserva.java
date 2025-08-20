package br.com.restaurante.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.web.servlet.mvc.annotation.ResponseStatusExceptionResolver;

import java.time.LocalDateTime;

@Entity
@Data

public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataHora;
    private Integer pessoas;
    //private StatusReserva status;
}
