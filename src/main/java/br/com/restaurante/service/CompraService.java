package br.com.restaurante.service;


import br.com.restaurante.entity.Compra;
import br.com.restaurante.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompraService {
    @Autowired
    private CompraRepository compraRepository;

    public Compra salvar(Compra novo){
        return compraRepository.save(novo);
    }

    public Iterable<Compra> listar(){
        return compraRepository.findAll();
    }

    public Compra atualizar(Compra compra){
        return compraRepository.save(compra);
    }

    public void remover (Long id){
        compraRepository.deleteById(id);
    }

    public Optional <Compra> pegarPorId(Long id){
        return compraRepository.findById(id);
    }
}
