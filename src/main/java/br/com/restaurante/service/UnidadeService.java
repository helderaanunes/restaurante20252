package br.com.restaurante.service;

import br.com.restaurante.entity.Unidade;
import br.com.restaurante.repository.UnidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class UnidadeService {

    @Autowired
    private UnidadeRepository unidadeRepository;

    public Unidade salvar(Unidade novo){

        return unidadeRepository.save(novo);
    }

    public Iterable<Unidade> listar(){
        return unidadeRepository.findAll();
    }
}
