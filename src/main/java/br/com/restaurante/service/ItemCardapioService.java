package br.com.restaurante.service;

import br.com.restaurante.entity.ItemCardapio;
import br.com.restaurante.repository.ItemCardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ItemCardapioService {

    @Autowired
    private ItemCardapioRepository itemCardapioRepository;

    public ItemCardapio salvar(ItemCardapio novo){
        return itemCardapioRepository.save(novo);
    }

    public Iterable<ItemCardapio> listar(){
        return itemCardapioRepository.findAll();
    }

    public ItemCardapio atualizar(ItemCardapio itemCardapio){
        return itemCardapioRepository.save(itemCardapio);
    }

    public void remover(Long id){
        itemCardapioRepository.deleteById(id);
    }

    public Optional<ItemCardapio> pegarPorId(Long id){
        return itemCardapioRepository.findById(id);
    }
}
