package br.com.restaurante.service;

import br.com.restaurante.entity.Usuario;
import br.com.restaurante.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario novo){
        return usuarioRepository.save(novo);
    }

    public Iterable<Usuario> listar(){
        return usuarioRepository.findAll();
    }
    public Usuario atualizar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public void remover (Long id){
        usuarioRepository.deleteById(id);
    }
    public Optional<Usuario> pegarPorId(Long id){
        return usuarioRepository.findById(id);
    }
}
