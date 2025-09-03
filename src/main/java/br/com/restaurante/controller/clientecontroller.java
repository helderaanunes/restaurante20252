package br.com.restaurante.controller;

import br.com.restaurante.entity.Cliente;
import br.com.restaurante.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class clientecontroller {

    @Autowired
    private    ClienteService clienteService;

    @PostMapping ("/cliente")
    public ResponseEntity <Cliente> salvar (@RequestBody Cliente cliente ){
        return new ResponseEntity<Cliente>(
                clienteService.salvar(cliente)
                        , HttpStatus.OK);


    }
    @GetMapping("/cliente")
    public Iterable<Cliente> listar(){
        return clienteService.listar();
            }
}
