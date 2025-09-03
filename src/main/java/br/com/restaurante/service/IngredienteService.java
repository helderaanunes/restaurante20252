package br.com.restaurante.service;

import br.com.restaurante.entity.Ingrediente;
import br.com.restaurante.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class IngredienteService {
    @Autowired
    private IngredienteRepository ingredienteRepository;

    public Ingrediente salvar(Ingrediente novo){
        return ingredienteRepository.save(novo);
    }
}
