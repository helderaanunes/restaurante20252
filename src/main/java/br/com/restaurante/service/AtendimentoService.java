package br.com.restaurante.service;

import br.com.restaurante.entity.Atendimento;
import br.com.restaurante.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AtendimentoService {

    @Autowired
    private AtendimentoRepository atendimentoRepository;


    public Atendimento salvar(Atendimento novo){
        return atendimentoRepository.save(novo);

    }
    public Iterable<Atendimento> listar() {
        return atendimentoRepository.findAll();
    }

}


