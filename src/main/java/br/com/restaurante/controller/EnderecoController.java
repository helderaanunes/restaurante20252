package br.com.restaurante.controller;

import br.com.restaurante.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;
}
