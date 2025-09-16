package br.com.restaurante.controller;

import br.com.restaurante.entity.Pagamento;
import br.com.restaurante.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping("/pagamento")
    public ResponseEntity<Pagamento> salvar(@RequestBody Pagamento pagamento) {
        return new ResponseEntity<Pagamento>(
                pagamentoService.salvar(pagamento), HttpStatus.OK);
    }

    @GetMapping("/pagamento")
    public Iterable<Pagamento> listar() {
        return pagamentoService.listar();
    }

    @PutMapping("pagamento")
    public ResponseEntity<Pagamento> atualizar(@RequestBody Pagamento pagamento) {
        return new ResponseEntity<Pagamento>(pagamentoService.atualizar(pagamento),HttpStatus.OK);
    }
    @DeleteMapping("/pagamento/{id}")
    public void delete (@PathVariable Long id){
        pagamentoService.remover(id);
    }
    @GetMapping("/pagamento/{id}")
    public ResponseEntity <Pagamento> pegarPorId(@PathVariable Long id){
        return new ResponseEntity<Pagamento>(pagamentoService.pegarPorId(id).get(),HttpStatus.OK);
    }
}
