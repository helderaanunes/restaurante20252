package br.com.restaurante.controller;

import br.com.restaurante.entity.Ingrediente;
import br.com.restaurante.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;

public class IngredienteController {
    @Autowired
    private IngredienteService ingredienteService;

    public void salvar (Ingrediente ingrediente){
        ingredienteService.salvar(ingrediente);
    }
}
