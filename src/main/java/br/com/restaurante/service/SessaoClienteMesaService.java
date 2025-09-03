package br.com.restaurante.service;

import br.com.restaurante.entity.SessaoClienteMesa;
import br.com.restaurante.entity.Usuario;
import br.com.restaurante.repository.SessaoClienteMesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessaoClienteMesaService {

    @Autowired
    private SessaoClienteMesaRepository sessaoClienteMesaRepository;


    public SessaoClienteMesa salvar(SessaoClienteMesa novo) {
       return sessaoClienteMesaRepository.save(novo);
    }
    public Iterable<SessaoClienteMesa> listar(){
        return sessaoClienteMesaRepository.findAll();
    }
}
