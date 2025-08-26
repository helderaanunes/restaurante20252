package br.com.restaurante.repository;

import br.com.restaurante.entity.Restaurante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository  extends CrudRepository <Restaurante,Long>{
}
