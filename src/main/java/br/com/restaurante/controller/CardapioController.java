package br.com.restaurante.controller;

import br.com.restaurante.entity.Cardapio;
import br.com.restaurante.service.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")

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
    @PutMapping("/cardapio")
    public ResponseEntity<Cardapio>
    atualizar(@RequestBody Cardapio cardapio){
        return new ResponseEntity<Cardapio>(cardapioService.atualizar(cardapio), HttpStatus.OK);
    }


    @DeleteMapping("/cardapio/{id}")
    public  void delete (@PathVariable Long id){
        cardapioService.remover(id);
    }

    @GetMapping("/cardapio/{id}")
    public ResponseEntity<Cardapio>
    pegarPorId(@PathVariable Long id){
        return new ResponseEntity<Cardapio>(
                cardapioService.pegarPorId(id).get(), HttpStatus.OK
        );
    }
}
