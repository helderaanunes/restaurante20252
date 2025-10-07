package br.com.restaurante.controller;

import br.com.restaurante.entity.Mesa;
import br.com.restaurante.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class MesaController {
    @Autowired
    private MesaService mesaService;

    @PostMapping("/mesa")
    public ResponseEntity<Mesa> salvar (@RequestBody Mesa mesa){
        return new ResponseEntity<Mesa>(
                mesaService.salvar(mesa)
                , HttpStatus.OK);

    }
    @GetMapping("/mesa")
    public Iterable<Mesa> listar(){
        return mesaService.listar();
    }
    @PutMapping("/mesa")
    public ResponseEntity<Mesa> atualizar(@RequestBody Mesa mesa){
        return new ResponseEntity<Mesa>(mesaService.atualizar(mesa), HttpStatus.OK);
    }
    @DeleteMapping("/mesa/{id}")
    public void delete (@PathVariable Long id){
        mesaService.remover(id);
    }
    @GetMapping("/mesa/{id}")
    public ResponseEntity<Mesa> pegarPorId(@PathVariable Long id){
        return new ResponseEntity<Mesa>(mesaService.pegarPorId(id).get(), HttpStatus.OK);
    }

}
