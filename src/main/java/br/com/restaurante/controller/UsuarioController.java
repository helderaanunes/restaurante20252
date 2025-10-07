package br.com.restaurante.controller;

import br.com.restaurante.entity.Usuario;
import br.com.restaurante.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin (origins = "*")

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

    @PutMapping("/usuario")
    public ResponseEntity<Usuario>
    atualizar(@RequestBody Usuario usuario){
        return new ResponseEntity<Usuario>
                (usuarioService.atualizar(usuario),HttpStatus.OK);
    }
    @DeleteMapping("/usuario/{id}")
    public void delete (@PathVariable Long id){
        usuarioService.remover(id);
    }
    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> pegarPorId(@PathVariable Long id){
        return new ResponseEntity<Usuario>(
                usuarioService.pegarPorId(id).get(),HttpStatus.OK);
    }

}

