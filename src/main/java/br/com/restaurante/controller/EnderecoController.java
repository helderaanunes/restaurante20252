package br.com.restaurante.controller;

import br.com.restaurante.entity.Endereco;
import br.com.restaurante.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("endereco")
    public ResponseEntity<Endereco> salvar (@RequestBody Endereco endereco){
        return new ResponseEntity<Endereco>(
        enderecoService.salvar(endereco), HttpStatus.OK);

    }

    @GetMapping("/endereco")
    public Iterable<Endereco> listar(){
        return enderecoService.listar();
    }

    @PutMapping("/endereco")
    public ResponseEntity<Endereco>
    atualizar(@RequestBody Endereco endereco){
        return new ResponseEntity<Endereco>(enderecoService.atualizar(endereco),HttpStatus.OK);

    }
    @DeleteMapping("/endereco/{id}")
    public  void delete(@PathVariable Long id){
        enderecoService.remover(id);
    }
    @GetMapping("/endereco/{id}")
    public ResponseEntity<Endereco> pegarPorId(@PathVariable Long id){
        return new ResponseEntity<Endereco>(enderecoService.pegarPorId(id).get(),HttpStatus.OK);
    }
}
