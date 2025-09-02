package br.com.restaurante.service;

import br.com.restaurante.entity.Permissao;
import br.com.restaurante.repository.PermissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PermissaoService {

    @Autowired
    private PermissaoRepository permissaoRepository;

    public Permissao salvar(Permissao novo){
        return permissaoRepository.save(novo);
    }
}
