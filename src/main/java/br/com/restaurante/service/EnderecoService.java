package br.com.restaurante.service;


import br.com.restaurante.entity.Endereco;
import br.com.restaurante.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
