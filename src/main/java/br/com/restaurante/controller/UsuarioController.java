package br.com.restaurante.controller;

import br.com.restaurante.entity.Usuario;
import br.com.restaurante.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario")
    public ResponseEntity<Usuario> salvar (@RequestBody Usuario usuario){
        return new ResponseEntity<Usuario>(
                usuarioService.salvar(usuario)
                , HttpStatus.OK);
    }

    @GetMapping("/usuario")
    public Iterable<Usuario> listar(){
        return usuarioService.listar();
    }

}

