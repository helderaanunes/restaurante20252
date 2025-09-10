package br.com.restaurante.controller;

import br.com.restaurante.entity.Reserva;
import br.com.restaurante.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping("/reserva")
    public ResponseEntity<Reserva> salvar (@RequestBody Reserva reserva){
        return new ResponseEntity<Reserva>(
                reservaService.salvar(reserva)
                , HttpStatus.OK);
    }
@GetMapping("/reserva")
    public Iterable<Reserva>listar(){
        return reservaService.listar();
}
@PutMapping("/reserva")
public ResponseEntity<Reserva> atualizar(@RequestBody Reserva reserva){
        return new ResponseEntity<Reserva>(reservaService.atualizar(reserva),HttpStatus.OK);
}
@DeleteMapping("/reserva/{id}")
    public void  delete(@PathVariable Long id){
        reservaService.remover(id);

}
@GetMapping("/reserva/{id}")
    public ResponseEntity<Reserva> pegarPorId(@PathVariable Long id){
        return new ResponseEntity<Reserva> (reservaService.pegarPorId(id).get(),HttpStatus.OK);
    }

}
