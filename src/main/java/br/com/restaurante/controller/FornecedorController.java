package br.com.restaurante.controller;

import br.com.restaurante.entity.Fornecedor;
import br.com.restaurante.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping("/fornecedor")
    public ResponseEntity<Fornecedor> salvar(@RequestBody Fornecedor fornecedor) {
        return new ResponseEntity<Fornecedor>(
                fornecedorService.salvar(fornecedor)
                , HttpStatus.OK);

    }

    @GetMapping("/fornecedor")
    public Iterable<Fornecedor> listar() {
        return fornecedorService.listar();
    }

    @PutMapping("/fornecedor")
    public ResponseEntity<Fornecedor>
    atualizar(@RequestBody Fornecedor fornecedor){
        return new ResponseEntity<Fornecedor>(
                fornecedorService.atualizar(fornecedor),
                HttpStatus.OK);
    }

    @DeleteMapping("/fornecedor/{id}")
    public void delete (@PathVariable long id){
        fornecedorService.remover(id);
    }
    @GetMapping("/fornecedor/{id}")
    public ResponseEntity<Fornecedor> pegarPorId(@PathVariable long id){
        return new ResponseEntity<Fornecedor>(
                fornecedorService.pegarPorId(id).get(),HttpStatus.OK);
    }
}


