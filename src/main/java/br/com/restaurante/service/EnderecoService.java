package br.com.restaurante.service;


import br.com.restaurante.entity.Endereco;
import br.com.restaurante.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoService  {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco salvar(Endereco novo){
       return enderecoRepository.save(novo);
    }
    public Iterable<Endereco> listar(){
        return enderecoRepository.findAll();
    }
    public Endereco atualizar(Endereco endereco){
        return enderecoRepository.save(endereco);
    }

    public void remover (Long id){
        enderecoRepository.deleteById(id);
    }
    public Optional<Endereco> pegarPorId(Long id){
        return enderecoRepository.findById(id);
    }
}

