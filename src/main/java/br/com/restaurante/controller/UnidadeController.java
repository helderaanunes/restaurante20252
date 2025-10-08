package br.com.restaurante.controller;

import br.com.restaurante.entity.Unidade;
import br.com.restaurante.service.UnidadeService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UnidadeController {
    @Autowired
    private UnidadeService unidadeService;

    @PostMapping("/unidade")
    public ResponseEntity<Unidade> salvar (@RequestBody Unidade unidade){
        return new ResponseEntity<Unidade>
                (unidadeService.salvar(unidade), HttpStatus.OK);
    }

    @GetMapping("/unidade")
    public Iterable<Unidade> listar(){
        return unidadeService.listar();
    }

    @PutMapping("/unidade")
    public ResponseEntity<Unidade>
    atualizar(@RequestBody Unidade unidade){
        return new ResponseEntity<Unidade>(unidadeService.atualizar(unidade), HttpStatus.OK);
    }
    @DeleteMapping("/unidade/{id}")
    public void delete (@PathVariable Long id){
        unidadeService.remover(id);
    }
    @GetMapping("/unidade/{id}")
    public ResponseEntity<Unidade> pegarPorId(@PathVariable Long id){
        return new ResponseEntity<Unidade>(unidadeService.pegarPorId(id).get(),HttpStatus.OK);
    }
}
