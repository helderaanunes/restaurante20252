package br.com.restaurante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import br.com.restaurante.entity.Usuario;
import br.com.restaurante.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario autenticar(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmailAndSenha(email,senha);
        if (usuario != null) {
            return usuario;
        }
        return null;
    }
}
