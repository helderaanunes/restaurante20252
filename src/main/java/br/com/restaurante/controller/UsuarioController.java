package br.com.restaurante.controller;

import br.com.restaurante.entity.Usuario;
import br.com.restaurante.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario")
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioService.salvar(usuario), HttpStatus.OK);
    }

    @GetMapping("/usuario")
    public Iterable<Usuario> listar(){
        return usuarioService.listar();
    }

    // >>> agora com {id} para casar com o front
    @PutMapping("/usuario/{id}")
    public ResponseEntity<Usuario> atualizar(@PathVariable Long id, @RequestBody Usuario usuario){
        usuario.setId(id); // garante que o id do path prevalece
        return new ResponseEntity<>(usuarioService.atualizar(usuario), HttpStatus.OK);
    }

    @DeleteMapping("/usuario/{id}")
    public void delete(@PathVariable Long id){
        usuarioService.remover(id);
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> pegarPorId(@PathVariable Long id){
        return new ResponseEntity<>(usuarioService.pegarPorId(id).get(), HttpStatus.OK);
    }
}
