package br.com.restaurante.service;

import br.com.restaurante.entity.CategoriaItem;
import br.com.restaurante.repository.CategoriaItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaItemService {

    @Autowired
    private CategoriaItemRepository categoriaItemRepository;

    public CategoriaItem salvar(CategoriaItem novo){
        return categoriaItemRepository.save(novo);
    }

    public Iterable<CategoriaItem> listar(){
        return categoriaItemRepository.findAll();
    }

    public CategoriaItem atualizar(CategoriaItem categoriaItem){
        return categoriaItemRepository.save(categoriaItem);
    }

    public void remover (Long id){
        categoriaItemRepository.deleteById(id);
    }

    public Optional<CategoriaItem> pegarPorId(Long id){
        return categoriaItemRepository.findById(id);
    }
}
