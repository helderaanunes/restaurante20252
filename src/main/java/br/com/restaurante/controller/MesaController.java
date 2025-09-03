package br.com.restaurante.controller;

import br.com.restaurante.entity.Mesa;
import br.com.restaurante.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
}
