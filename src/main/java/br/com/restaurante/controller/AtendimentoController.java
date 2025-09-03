package br.com.restaurante.controller;

import br.com.restaurante.entity.Atendimento;
import br.com.restaurante.service.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtendimentoController {
    @Autowired
    private AtendimentoService atendimentoService;
    @PostMapping("/atendimento")
    public ResponseEntity<Atendimento> salvar (@RequestBody Atendimento atendimento){
        return new ResponseEntity<Atendimento>(
                atendimentoService.salvar(atendimento)
                , HttpStatus.OK);
    }

    @GetMapping("/atendimento")
    public Iterable<Atendimento> listar(){
        return atendimentoService.listar();
    }

    
}

