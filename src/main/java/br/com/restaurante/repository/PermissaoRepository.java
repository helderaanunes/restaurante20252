package br.com.restaurante.repository;

import br.com.restaurante.entity.Permissao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissaoRepository
        extends CrudRepository <Permissao, Long> {
}
