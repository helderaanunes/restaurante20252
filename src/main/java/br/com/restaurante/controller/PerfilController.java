package br.com.restaurante.controller;

import br.com.restaurante.entity.Perfil;
import br.com.restaurante.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerfilController {
    @Autowired //Construtor e TODOS os métodos de interface abstrata ->Ingeção de Dependência
    private PerfilService perfilService;
    @PostMapping("/perfil")

    public ResponseEntity<Perfil> salvar(@RequestBody Perfil perfil){
        return new ResponseEntity<Perfil>(
                perfilService.salvar(perfil), HttpStatus.OK);
    }

    @GetMapping("/perfil")
    public Iterable<Perfil> listar(){
        return perfilService.listar();
    }


}
