package br.com.restaurante.controller;

import br.com.restaurante.entity.Unidade;
import br.com.restaurante.service.UnidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class UnidadeController {
    @Autowired
    private UnidadeService unidadeService;

    @PostMapping("/unidade")
    public ResponseEntity<Unidade> salvar (@RequestBody Unidade unidade){
        return new ResponseEntity<Unidade>
                (unidadeService.salvar(unidade), HttpStatus.OK);
    }

    @GetMapping("/unidade")
    public Iterable<Unidade> listar(){
        return unidadeService.listar();
    }
}
