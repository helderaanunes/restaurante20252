package br.com.restaurante.controller;

import br.com.restaurante.dto.GraficoDTO;
import br.com.restaurante.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin(origins = "*")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/lucro/diario")
    public List<GraficoDTO> lucroDiario() {
        return dashboardService.getLucroDiario();
    }

    @GetMapping("/lucro/semanal")
    public List<GraficoDTO> lucroSemanal() {
        return dashboardService.getLucroSemanal();
    }

    @GetMapping("/lucro/mensal")
    public List<GraficoDTO> lucroMensal() {
        return dashboardService.getLucroMensal();
    }

    /**
     * Exemplo de chamada:
     * GET /api/dashboard/lucro/intervalo?inicio=2025-11-01&fim=2025-11-10
     *
     * @param inicio yyyy-MM-dd
     * @param fim    yyyy-MM-dd
     */
    @GetMapping("/lucro/intervalo")
    public List<GraficoDTO> lucroPorIntervalo(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate inicio,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fim) {
        return dashboardService.getLucroPorIntervalo(inicio, fim);
    }
}
