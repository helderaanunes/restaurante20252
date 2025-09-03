package br.com.restaurante.controller;

import br.com.restaurante.entity.Cardapio;
import br.com.restaurante.service.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardapioController {
    @Autowired
    private CardapioService cardapioService;
    @PostMapping("/cardapio")
    public ResponseEntity<Cardapio> salvar(@RequestBody Cardapio cardapio){
        return new ResponseEntity<Cardapio>(cardapioService.salvar(cardapio), HttpStatus.OK);
    }

    @GetMapping("/cardapio")
    public Iterable<Cardapio> listar(){
        return cardapioService.listar();
    }
    

}
