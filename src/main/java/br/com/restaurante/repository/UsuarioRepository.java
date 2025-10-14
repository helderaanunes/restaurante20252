package br.com.restaurante.repository;


import br.com.restaurante.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
