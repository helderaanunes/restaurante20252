package br.com.restaurante.controller;

import br.com.restaurante.entity.Restaurante;
import br.com.restaurante.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
    
}
