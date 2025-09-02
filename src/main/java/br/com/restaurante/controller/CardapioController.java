package br.com.restaurante.controller;

import br.com.restaurante.service.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardapioController {
    @Autowired
    private CardapioService cardapioService;
}
