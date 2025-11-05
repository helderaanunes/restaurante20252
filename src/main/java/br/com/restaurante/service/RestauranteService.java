package br.com.restaurante.service;

import br.com.restaurante.entity.Restaurante;
import br.com.restaurante.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RestauranteService {
    @Autowired
    private RestauranteRepository restauranteRepository;

    public Restaurante salvar(Restaurante novo){
        return restauranteRepository.save(novo);
    }

    public Iterable<Restaurante> listar(){
        return restauranteRepository.findAll();
    }

    public Restaurante atualizar(Restaurante restaurante){
        return restauranteRepository.save(restaurante);
    }

    public  void remover(Long id){
        restauranteRepository.deleteById(id);
    }
    public Optional<Restaurante> pegarPorId(Long id){
        return restauranteRepository.findById(id);
    }

}
