package br.com.restaurante.service;

import br.com.restaurante.entity.ChaveAcessoMesa;
import br.com.restaurante.repository.ChaveAcessoMesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChaveAcessoMesaService {
    @Autowired
    private ChaveAcessoMesaRepository chaveAcessoMesaRepository;

    public void salvar(ChaveAcessoMesa novo){
        chaveAcessoMesaRepository.save(novo);
    }
}