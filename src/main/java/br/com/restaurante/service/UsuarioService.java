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

    // 🔹 Autenticação simples (sem PasswordEncoder)
    public Usuario autenticar(String email, String senha) {
        if (email == null || senha == null) return null;

        Usuario usuario = usuarioRepository.findByEmailAndSenha(email, senha);
        if (usuario != null && usuario.getSenha() != null && usuario.getSenha().equals(senha)) {
            return usuario;
        }
        return null;
    }

    // 🔹 Criar novo usuário
    public Usuario salvar(Usuario usuario) {
        // Se não houver role definida, define o padrão
        if (usuario.getRole() == null || usuario.getRole().isEmpty()) {
            usuario.setRole("USER");
        }

        // Se o campo ativo não estiver definido, define como true
        if (!usuario.isAtivo()) {
            usuario.setAtivo(true);
        }

        return usuarioRepository.save(usuario);
    }

    // 🔹 Listar todos os usuários
    public Iterable<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    // 🔹 Atualizar usuário existente
    public Usuario atualizar(Usuario usuario) {
        Optional<Usuario> existente = usuarioRepository.findById(usuario.getId());
        if (existente.isPresent()) {
            Usuario atual = existente.get();
            atual.setNome(usuario.getNome());
            atual.setEmail(usuario.getEmail());
            atual.setSenha(usuario.getSenha());
            atual.setRole(usuario.getRole());
            atual.setAtivo(usuario.isAtivo());
            atual.setPermissao(usuario.getPermissao());
            return usuarioRepository.save(atual);
        } else {
            throw new RuntimeException("Usuário não encontrado para atualização");
        }
    }

    // 🔹 Remover usuário por ID
    public void remover(Long id) {
        usuarioRepository.deleteById(id);
    }

    // 🔹 Buscar por ID
    public Optional<Usuario> pegarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    // 🔹 Buscar por e-mail
    /*public Usuario findByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }*/
}
