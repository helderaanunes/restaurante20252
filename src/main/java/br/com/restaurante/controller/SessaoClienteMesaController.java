package br.com.restaurante.controller;

import br.com.restaurante.entity.SessaoClienteMesa;
import br.com.restaurante.service.SessaoClienteMesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessaoClienteMesaController {

    @Autowired
    private SessaoClienteMesaService sessaoClienteMesaService;

    @PostMapping("/sessaoclientemesa")
    public ResponseEntity<SessaoClienteMesa> salvar(@RequestBody SessaoClienteMesa sessaoclientemesa) {
        return new ResponseEntity<SessaoClienteMesa>(
                sessaoClienteMesaService.salvar(sessaoclientemesa)
                , HttpStatus.OK);
    }

    @GetMapping("/sessaoclientemesa")
    public Iterable<SessaoClienteMesa> listar() {
        return sessaoClienteMesaService.listar();
    }
}