package br.com.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.restaurante.dto.LoginRequestDTO;
import br.com.restaurante.entity.Usuario;
import br.com.restaurante.security.JwtUtil;
import br.com.restaurante.service.UsuarioService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequestDTO loginRequest) {
        // Verifica se o usuário existe e se a senha está correta
        Usuario usuario = usuarioService.autenticar(loginRequest.getEmail(), loginRequest.getSenha());

        if (usuario == null) {
            Map<String, String> response = new HashMap<>();
            response.put("erro", "E-mail ou senha inválidos.");
            return ResponseEntity.status(401).body(response);
        }

        // Obtém a role (ou lista de roles) do usuário autenticado
        String role = usuario.getPermissao().getDescricao(); // ajusta conforme seu relacionamento

        // Gera o token JWT
        String token = JwtUtil.generateToken(usuario.getEmail(), role);

        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        response.put("usuario", usuario.getEmail());
        response.put("role", role);

        return ResponseEntity.ok(response);
    }
}
