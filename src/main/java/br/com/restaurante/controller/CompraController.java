package br.com.restaurante.controller;

import br.com.restaurante.entity.Compra;
import br.com.restaurante.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class CompraController {
    @Autowired
    private CompraService compraService;

    @PostMapping("/compra")
    public ResponseEntity<Compra> salvar (@RequestBody Compra compra){
        return new ResponseEntity<Compra>(compraService.salvar(compra),HttpStatus.OK);
    }

    @GetMapping("/compra")
    public Iterable<Compra> listar(){
        return compraService.listar();
    }

    @PutMapping("/compra")
    public ResponseEntity<Compra>
    atualizar(@RequestBody Compra compra){
        return new ResponseEntity<Compra>(compraService.atualizar(compra), HttpStatus.OK);
    }

    @DeleteMapping("/compra/{id}")
    public void delete (@PathVariable Long id){
        compraService.remover(id);
    }

    @GetMapping("/compra/{id}")
    public ResponseEntity<Compra> pegarPorId(@PathVariable Long id){
        return new ResponseEntity<Compra>(compraService.pegarPorId(id).get(), HttpStatus.OK);
    }



}
