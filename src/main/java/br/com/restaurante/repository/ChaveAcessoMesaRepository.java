package br.com.restaurante.repository;

import br.com.restaurante.entity.ChaveAcessoMesa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChaveAcessoMesaRepository extends CrudRepository<ChaveAcessoMesa, Long>{
}
