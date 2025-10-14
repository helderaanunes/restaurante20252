package br.com.restaurante.controller;

import br.com.restaurante.entity.Atendimento;
import br.com.restaurante.service.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/atendimento")
    public ResponseEntity<Atendimento>atualizar(@RequestBody Atendimento atendimento){
        return new ResponseEntity<Atendimento>(atendimentoService.atualizar(atendimento),HttpStatus.OK);
    }
    @DeleteMapping("/atendimento/{id}")
    public void delete (@PathVariable Long id){
        atendimentoService.remover(id);
    }
    @GetMapping("/atendimento/{id}")
    public ResponseEntity<Atendimento> pegarPorId(@PathVariable long id){
        return new ResponseEntity<Atendimento>(atendimentoService.pegarPorId(id).get(),HttpStatus.OK);
    }
}

