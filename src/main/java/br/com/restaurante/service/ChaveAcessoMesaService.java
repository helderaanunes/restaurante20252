package br.com.restaurante.service;

import br.com.restaurante.entity.ChaveAcessoMesa;
import br.com.restaurante.repository.ChaveAcessoMesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class ChaveAcessoMesaService {
    @Autowired
    private ChaveAcessoMesaRepository chaveAcessoMesaRepository;

    public ChaveAcessoMesa salvar(ChaveAcessoMesa novo){
        return chaveAcessoMesaRepository.save(novo);
    }

    public Iterable<ChaveAcessoMesa> listar(){
        return chaveAcessoMesaRepository.findAll();
    }
}