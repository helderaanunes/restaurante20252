package br.com.restaurante.controller;

import br.com.restaurante.entity.Permissao;
import br.com.restaurante.entity.Usuario;
import br.com.restaurante.service.PermissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin (origins = "*")
@RestController
public class PermissaoController {

    @Autowired
    private PermissaoService permissaoService;

    @PostMapping("/permissao")
    public ResponseEntity<Permissao> salvar(@RequestBody Permissao permissao){
        return new ResponseEntity<Permissao>(
        permissaoService.salvar(permissao)
                , HttpStatus.OK);
    }

    @GetMapping("/permissao")
    public Iterable<Permissao> listar(){
        return permissaoService.listar();
    }
}

