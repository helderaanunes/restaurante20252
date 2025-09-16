package br.com.restaurante.service;

import br.com.restaurante.entity.Atendimento;
import br.com.restaurante.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;


@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository atendimentoRepository;


    public Atendimento salvar(Atendimento novo){
        return atendimentoRepository.save(novo);

    }
    public Iterable<Atendimento> listar() {
        return atendimentoRepository.findAll();
    }
    public Atendimento atualizar(Atendimento atendimento){
        return atendimentoRepository.save(atendimento);
    }
    public void remover (Long id){
        atendimentoRepository.deleteById(id);
    }
    public Optional<Atendimento> pegarPorId(Long id){
        return atendimentoRepository.findById(id);
    }



}


