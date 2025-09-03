package br.com.restaurante.service;

import br.com.restaurante.entity.ItemCardapio;
import br.com.restaurante.repository.ItemCardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemCardapioService {

    @Autowired
    private ItemCardapioRepository itemCardapioRepository;

    public ItemCardapio salvar(ItemCardapio novo){
        return itemCardapioRepository.save(novo);
    }

    public Iterable<ItemCardapio> listar(){
        return itemCardapioRepository.findAll();
    }
}
