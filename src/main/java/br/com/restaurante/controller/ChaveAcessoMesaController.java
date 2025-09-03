package br.com.restaurante.controller;

import br.com.restaurante.entity.ChaveAcessoMesa;
import br.com.restaurante.service.ChaveAcessoMesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChaveAcessoMesaController {

    @Autowired
    private ChaveAcessoMesaService chaveAcessoMesaService;

    @PostMapping("/chaveAcessoMesa")
    public ResponseEntity<ChaveAcessoMesa> salvar (@RequestBody ChaveAcessoMesa chaveAcessoMesa){
        return new ResponseEntity<ChaveAcessoMesa>(chaveAcessoMesaService.salvar(chaveAcessoMesa), HttpStatus.OK);
    }

    @GetMapping("/ChaveAcessoMesa")
    public Iterable<ChaveAcessoMesa> listar(){
        return chaveAcessoMesaService.listar();
    }
}
