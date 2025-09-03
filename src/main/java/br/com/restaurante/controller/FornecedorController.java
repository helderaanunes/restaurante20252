package br.com.restaurante.controller;

import br.com.restaurante.entity.Fornecedor;
import br.com.restaurante.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping("/fornecedor")
    public ResponseEntity<Fornecedor> salvar(@RequestBody Fornecedor fornecedor){
        return new ResponseEntity<Fornecedor>(
                fornecedorService.salvar(fornecedor)
                , HttpStatus.OK);

    }
}

@GetMapping("/fornecedor")
public Iterable<Fornecedor> listar(){
    return fornecedorService.listar();
}