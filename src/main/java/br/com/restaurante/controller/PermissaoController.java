package br.com.restaurante.controller;

import br.com.restaurante.entity.Permissao;
import br.com.restaurante.service.PermissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class PermissaoController {

    @Autowired
    private PermissaoService permissaoService;

    @PostMapping("/permissao")
    public ResponseEntity<Permissao> salvar(@RequestBody Permissao permissao) {
        return new ResponseEntity<Permissao>(permissaoService.salvar(permissao), HttpStatus.OK);
    }

    @GetMapping("/permissao")
    public Iterable<Permissao> listar() {
        return permissaoService.listar();
    }

    @PutMapping("/permissao")
    public ResponseEntity<Permissao> atualizar(@RequestBody Permissao permissao) {
        return new ResponseEntity<Permissao>(permissaoService.atualizar(permissao), HttpStatus.OK);
    }

    @DeleteMapping("/permissao/{id}")
    public void delete(@PathVariable Long id) {
        permissaoService.remover(id);
    }

    @GetMapping("/permissao/{id}")
    public ResponseEntity<Permissao> pegarPorId(@PathVariable Long id) {
        return new ResponseEntity<Permissao>(permissaoService.pegarPorId(id).get(), HttpStatus.OK);
    }
}
