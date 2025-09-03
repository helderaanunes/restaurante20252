package br.com.restaurante.controller;

import br.com.restaurante.entity.Reserva;
import br.com.restaurante.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PutMapping("/reserva")
    public ResponseEntity<Reserva> salvar (@RequestBody Reserva reserva){
        return new ResponseEntity<Reserva>(
                reservaService.salvar(reserva)
                , HttpStatus.OK);
    }
@GetMapping("/reserva")
    public Iterable<Reserva>listar(){
        return reservaService.listar();
}

}