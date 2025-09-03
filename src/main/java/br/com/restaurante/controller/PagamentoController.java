package br.com.restaurante.controller;

import br.com.restaurante.entity.Pagamento;
import br.com.restaurante.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping("/pagamento")
    public ResponseEntity<Pagamento> salvar(@RequestBody Pagamento pagamento){
        return new ResponseEntity<Pagamento>(
                pagamentoService.salvar(pagamento), HttpStatus.OK);
    }

    @GetMapping("/pagamento")
    public Iterable<Pagamento> listar(){
        return pagamentoService.listar();
    }
}
