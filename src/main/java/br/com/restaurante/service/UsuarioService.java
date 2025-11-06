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

    // Autenticação simples
    public Usuario autenticar(String email, String senha) {
        return usuarioRepository.findByEmailAndSenha(email, senha);
    }

    // Salvar novo usuário
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Listar todos os usuários
    public Iterable<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    // Atualizar um usuário existente
    public Usuario atualizar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Remover usuário por ID
    public void remover(Long id) {
        usuarioRepository.deleteById(id);
    }

    // Buscar usuário por ID
    public Optional<Usuario> pegarPorId(Long id) {
        return usuarioRepository.findById(id);
    }
}
