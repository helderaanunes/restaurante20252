package br.com.restaurante.repository;

import br.com.restaurante.entity.Fornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FornecedorRepository extends CrudRepository <Fornecedor, Long >{
}
