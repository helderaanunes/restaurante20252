package br.com.restaurante.controller;

import br.com.restaurante.entity.Restaurante;
import br.com.restaurante.entity.Usuario;
import br.com.restaurante.service.RestauranteService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @PostMapping("/restaurante")
    public ResponseEntity<Restaurante> salvar (@RequestBody Restaurante restaurante){
     return new ResponseEntity<Restaurante>(restauranteService.salvar(restaurante), HttpStatus.OK);
    }

    @GetMapping("/restaurante")
    public Iterable<Restaurante> listar(){
        return restauranteService.listar();
    }

    @PutMapping("/restaurante)")
    public ResponseEntity<Restaurante>
    atualizar(@RequestBody Restaurante restaurante){
        return new ResponseEntity<Restaurante>(restauranteService.atualizar(restaurante), HttpStatus.OK);
    }
    @DeleteMapping("/restaurante/{id}")
    public  void delete(@PathVariable long id){
        restauranteService.remover(id);
    }
    @GetMapping("/restaurante;{id}")
    public ResponseEntity<Restaurante> pegarPorId(@PathVariable long id){
        return new ResponseEntity<Restaurante>(restauranteService.pegarPorId(id).get(), HttpStatus.OK);
    }
}
