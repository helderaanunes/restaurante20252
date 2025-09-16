package br.com.restaurante.controller;

import br.com.restaurante.entity.Ingrediente;
import br.com.restaurante.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class IngredienteController {
    @Autowired
    private IngredienteService ingredienteService;

    @PostMapping("/ingrediente")
    public ResponseEntity<Ingrediente> salvar (@RequestBody  Ingrediente ingrediente){
        return new  ResponseEntity<Ingrediente>(ingredienteService.salvar(ingrediente),HttpStatus.OK);
    }

    @GetMapping("/ingrediente")
    public Iterable<Ingrediente>listar(){
        return ingredienteService.listar();
    }

    @PutMapping("/ingrediente")
    public ResponseEntity<Ingrediente>atualizar(@RequestBody Ingrediente ingrediente){
        return new ResponseEntity<Ingrediente>(ingredienteService.atualizar(ingrediente), HttpStatus.OK);
    }

    @DeleteMapping("/ingrediente/{id}")
    public void delete(@PathVariable Long id){
        ingredienteService.remover(id);
    }
    @GetMapping("/ingrediente/{id}")
    public ResponseEntity<Ingrediente> pegarPorId(@PathVariable Long id){
        return new ResponseEntity<Ingrediente>(ingredienteService.pegarPorId(id).get(), HttpStatus.OK);
    }
}
