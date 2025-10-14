package br.com.restaurante.service;

import br.com.restaurante.entity.Fornecedor;
import br.com.restaurante.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor salvar(Fornecedor novo) {
       return fornecedorRepository.save(novo);
    }
    public Iterable<Fornecedor> listar(){
        return fornecedorRepository.findAll();
}

public Fornecedor atualizar(Fornecedor fornecedor){
        return fornecedorRepository.save(fornecedor);
}

public void remover(long id){
        fornecedorRepository.deleteById(id);
}

public Optional<Fornecedor> pegarPorId(long id){
        return fornecedorRepository.findById(id);
}
}
