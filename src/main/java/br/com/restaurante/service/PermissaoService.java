package br.com.restaurante.service;

import br.com.restaurante.entity.Permissao;
import br.com.restaurante.repository.PermissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PermissaoService {

    @Autowired
    private PermissaoRepository permissaoRepository;

    public Permissao salvar(Permissao permissao) {
        return permissaoRepository.save(permissao);
    }

    public Iterable<Permissao> listar() {
        return permissaoRepository.findAll();
    }

    public Permissao atualizar(Permissao permissao) {
        return permissaoRepository.save(permissao);
    }

    public void remover(Long id) {
        permissaoRepository.deleteById(id);
    }

    public Optional<Permissao> pegarPorId(Long id) {
        return permissaoRepository.findById(id);
    }
}
