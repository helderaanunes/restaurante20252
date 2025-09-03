package br.com.restaurante.service;

import br.com.restaurante.entity.Reserva;
import br.com.restaurante.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {
    @Autowired

    private ReservaRepository reservaRepository;

    public Reserva salvar(Reserva novo){
         return reservaRepository.save(novo);
    }
    public Iterable<Reserva> listar(){
        return reservaRepository.findAll();
    }
}
