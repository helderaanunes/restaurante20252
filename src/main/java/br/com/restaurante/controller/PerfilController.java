package br.com.restaurante.controller;

import br.com.restaurante.entity.Perfil;
import br.com.restaurante.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
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

    @PutMapping("/perfil")
    public ResponseEntity<Perfil> atualizar(@RequestBody Perfil perfil){
        return new ResponseEntity<Perfil>(perfilService.atualizar(perfil), HttpStatus.OK);
    }

    @DeleteMapping("/perfil/{id}")
    public void delete(@PathVariable long id){
        perfilService.remover(id);
    }
    //@PathVariable = pega {id} e transfoma em long,
    //por isso, se {} tivesse pitrp nome, teria que colocar o outro nome na variável long

    @GetMapping("/perfil{id}")
    public ResponseEntity<Perfil> pegarPorId(@PathVariable long id){
        return new ResponseEntity<Perfil>(perfilService.pegarPorId(id).get(), HttpStatus.OK);
    }
//OK retorna 200

}
