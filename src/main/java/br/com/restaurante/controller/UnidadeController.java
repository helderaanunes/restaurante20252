package br.com.restaurante.controller;

import br.com.restaurante.service.UnidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class UnidadeController {
    @Autowired
    private UnidadeService unidadeService;
}
