package br.com.restaurante.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO simples com apenas 2 atributos conforme solicitado:
 * - label: texto que identifica o ponto do gráfico (data/semana/mês)
 * - value: valor numérico (soma do lucro)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GraficoDTO {
    private String label;
    private Double value;
}
