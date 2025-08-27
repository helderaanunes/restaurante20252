package br.com.restaurante.controller;

import br.com.restaurante.entity.ChaveAcessoMesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChaveAcessoMesaController {

    @Autowired
    private ChaveAcessoMesa chaveAcessoMesa;
}
