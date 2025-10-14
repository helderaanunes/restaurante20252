package br.com.restaurante.controller;

import br.com.restaurante.entity.CategoriaItem;
import br.com.restaurante.service.CategoriaItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CategoriaItemController {

    @Autowired
    private CategoriaItemService categoriaItemService;

    @PostMapping("/categoriaItem")
    public ResponseEntity<CategoriaItem> salvar (@RequestBody CategoriaItem categoriaItem){
        return new ResponseEntity<CategoriaItem>(categoriaItemService.salvar(categoriaItem), HttpStatus.OK);
    }

    @GetMapping("/categoriaItem")
    public Iterable<CategoriaItem> listar(){
        return categoriaItemService.listar();
    }

    @PutMapping("/categoriaItem")
    public ResponseEntity<CategoriaItem>
    atualizar(@RequestBody CategoriaItem categoriaItem){
        return new ResponseEntity<CategoriaItem>(categoriaItemService.atualizar(categoriaItem), HttpStatus.OK);
    }

    @DeleteMapping("/categoriaItem/{id}")
    public void delete (@PathVariable Long id){
        categoriaItemService.remover(id);
    }

    @GetMapping("/categoriaItem/{id}")
    public ResponseEntity<CategoriaItem> pegarPorId(@PathVariable Long id){
        return new ResponseEntity<CategoriaItem>(categoriaItemService.pegarPorId(id).get(), HttpStatus.OK);
    }


}
