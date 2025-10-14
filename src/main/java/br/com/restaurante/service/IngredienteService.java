package br.com.restaurante.service;

import br.com.restaurante.entity.Ingrediente;
import br.com.restaurante.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class IngredienteService {
    @Autowired
    private IngredienteRepository ingredienteRepository;

    public Ingrediente salvar(Ingrediente novo){
        return ingredienteRepository.save(novo);
    }

    public Iterable<Ingrediente> listar(){
        return ingredienteRepository.findAll();
    }

    public Ingrediente atualizar(Ingrediente ingrediente){
        return ingredienteRepository.save(ingrediente);
    }

    public void remover(Long id){
        ingredienteRepository.deleteById(id);
    }

    public Optional<Ingrediente> pegarPorId(Long id){
        return ingredienteRepository.findById(id);
    }
}
