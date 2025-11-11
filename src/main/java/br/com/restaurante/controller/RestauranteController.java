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
import java.util.Optional;



@RestController

@RequestMapping("/restaurante")

@CrossOrigin(origins = "*")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @PostMapping()
    public ResponseEntity<Restaurante> salvar (@RequestBody Restaurante restaurante){
     return new ResponseEntity<Restaurante>(restauranteService.salvar(restaurante), HttpStatus.OK);
    }

    @GetMapping()
    public Iterable<Restaurante> listar(){
        return restauranteService.listar();
    }


   // @PutMapping("/restaurante)")
//    public ResponseEntity<Restaurante>
//    atualizar(@RequestBody Restaurante restaurante){
//        return new ResponseEntity<Restaurante>(restauranteService.atualizar(restaurante), HttpStatus.OK);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody Restaurante restauranteAtualizado) {
        Optional<Restaurante> restauranteOptional = restauranteService.pegarPorId(id);

        if (restauranteOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Restaurante restauranteExistente = restauranteOptional.get();
        // Atualiza os campos permitidos (exemplo: nome e cnpj)
        restauranteExistente.setNome(restauranteAtualizado.getNome());
        restauranteExistente.setCnpj(restauranteAtualizado.getCnpj());

        Restaurante atualizado = restauranteService.atualizar(restauranteExistente);
        return ResponseEntity.ok(atualizado);
    }


    @DeleteMapping("/{id}")

    public  void delete(@PathVariable long id){
        restauranteService.remover(id);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurante> pegarPorId(@PathVariable long id){
        return new ResponseEntity<Restaurante>(restauranteService.pegarPorId(id).get(), HttpStatus.OK);
    }

}
