package br.com.restaurante.service;

import br.com.restaurante.dto.GraficoDTO;
import br.com.restaurante.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class DashboardService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    // Converte Object[] result -> GraficoDTO (label, value)
    private GraficoDTO toDto(Object[] r, String prefixLabel) {
        String label = r[0] == null ? "N/A" : r[0].toString();
        if (prefixLabel != null && !prefixLabel.isBlank()) {
            label = prefixLabel + " " + label;
        }
        Double value = r[1] == null ? 0.0 : ((Number) r[1]).doubleValue();
        return new GraficoDTO(label, value);
    }

    public List<GraficoDTO> getLucroDiario() {
        List<Object[]> raw = pagamentoRepository.lucroDiario();
        return raw.stream()
                .map(r -> toDto(r, null))
                .toList();
    }

    public List<GraficoDTO> getLucroSemanal() {
        List<Object[]> raw = pagamentoRepository.lucroSemanal();
        // r[0] tende a ser algo como YEARWEEK numeric, então colocamos prefixo "Semana"
        return raw.stream()
                .map(r -> toDto(r, "Semana"))
                .toList();
    }

    public List<GraficoDTO> getLucroMensal() {
        List<Object[]> raw = pagamentoRepository.lucroMensal();
        // r[0] já virá em formato 'YYYY-MM' por conta do DATE_FORMAT usado no repo
        return raw.stream()
                .map(r -> toDto(r, null))
                .toList();
    }

    public List<GraficoDTO> getLucroPorIntervalo(LocalDate inicio, LocalDate fim) {
        // converte LocalDate para LocalDateTime (início de dia -> fim do dia)
        LocalDateTime startDateTime = inicio.atStartOfDay();
        LocalDateTime endDateTime = fim.atTime(LocalTime.MAX); // 23:59:59.999999999
        List<Object[]> raw = pagamentoRepository.lucroPorIntervalo(startDateTime, endDateTime);
        return raw.stream()
                .map(r -> toDto(r, null))
                .toList();
    }
}
