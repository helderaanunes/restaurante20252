package br.com.restaurante.service;

import br.com.restaurante.entity.Cardapio;
import br.com.restaurante.repository.CardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardapioService {
    @Autowired
    private CardapioRepository cardapioRepository;

    public void salvar(Cardapio novo){
        cardapioRepository.save(novo);
    }
}
