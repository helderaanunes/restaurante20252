package br.com.restaurante.controller;

import br.com.restaurante.entity.Cliente;
import br.com.restaurante.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
    @PutMapping("/Cliente")
    public ResponseEntity<Cliente> atualizar(@RequestBody Cliente cliente){
        return new ResponseEntity<Cliente>(clienteService.atualizar(cliente),HttpStatus.OK);
    }
    @DeleteMapping("/cliente/{id}")
    public void delete(@PathVariable Long id) {
        clienteService.remever(id);
    }
    @GetMapping("/cliente/{id}")
    public ResponseEntity<Cliente> pegarPorId(@PathVariable Long id){
        return new ResponseEntity<Cliente>(
                clienteService.pegarPorId(id).get(),HttpStatus.OK);
    }
}
