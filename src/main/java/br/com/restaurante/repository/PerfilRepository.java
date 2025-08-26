package br.com.restaurante.repository;

import br.com.restaurante.entity.Perfil;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends CrudRepository<Perfil,Long> {

}
