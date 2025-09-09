package br.com.restaurante.controller;

import br.com.restaurante.entity.ChaveAcessoMesa;
import br.com.restaurante.service.ChaveAcessoMesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChaveAcessoMesaController {

    @Autowired
    private ChaveAcessoMesaService chaveAcessoMesaService;

    @PostMapping("/chaveAcessoMesa")
    public ResponseEntity<ChaveAcessoMesa> salvar (@RequestBody ChaveAcessoMesa chaveAcessoMesa){
        return new ResponseEntity<ChaveAcessoMesa>(chaveAcessoMesaService.salvar(chaveAcessoMesa), HttpStatus.OK);
    }

    @GetMapping("/ChaveAcessoMesa")
    public Iterable<ChaveAcessoMesa> listar(){
        return chaveAcessoMesaService.listar();
    }

    @PutMapping("/chaveAcessoMesa")
    public  ResponseEntity<ChaveAcessoMesa>
    atualizar(@RequestBody ChaveAcessoMesa chaveAcessoMesa){
        return new ResponseEntity<ChaveAcessoMesa>(chaveAcessoMesaService.atualizar(chaveAcessoMesa), HttpStatus.OK);
    }

    @DeleteMapping("/chaveAcessoMesa/{id}")
    public void delete (@PathVariable Long id){
        chaveAcessoMesaService.remover(id);
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<ChaveAcessoMesa> pegarPorId(@PathVariable Long id){
        return new ResponseEntity<ChaveAcessoMesa>(chaveAcessoMesaService.pegarPorId(id).get(), HttpStatus.OK);
    }
}
