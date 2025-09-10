package br.com.restaurante.controller;

import br.com.restaurante.entity.ItemCardapio;
import br.com.restaurante.service.ItemCardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemCardapioController {

    @Autowired
    private ItemCardapioService itemCardapioService;

    @PostMapping("/item_cardapio")
    public ResponseEntity<ItemCardapio> salvar (@RequestBody ItemCardapio itemCardapio) {
        return new ResponseEntity<ItemCardapio>(itemCardapioService.salvar(itemCardapio), HttpStatus.OK);
    }

    @GetMapping("/item_cardapio")
    public Iterable<ItemCardapio> listar(){
        return itemCardapioService.listar();
    }

    @PutMapping("/item_cardapio")
    public ResponseEntity<ItemCardapio> atualizar(@RequestBody ItemCardapio itemCardapio){
        return new ResponseEntity<ItemCardapio>(itemCardapioService.atualizar(itemCardapio), HttpStatus.OK);
    }

    @DeleteMapping("/item_cardapio/{id}")
    public void delete(@PathVariable Long id){
        itemCardapioService.remover(id);
    }

    @GetMapping("/item_cardapio/{id}")
    public ResponseEntity<ItemCardapio> pegarPorId(@PathVariable Long id){
        return new ResponseEntity<ItemCardapio>(itemCardapioService.pegarPorId(id).get(), HttpStatus.OK);
    }

}
