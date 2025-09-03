package br.com.restaurante.service;

import br.com.restaurante.entity.Usuario;
import br.com.restaurante.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
