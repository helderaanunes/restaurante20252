package br.com.restaurante.controller;

import br.com.restaurante.entity.Usuario;
import br.com.restaurante.service.UsuarioService;
import br.com.restaurante.security.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")

public class AuthController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> body) {
        String email = body.get("email");
        String senha = body.get("senha");
        if ((email == null || senha == null) && body.containsKey("username")) {
            email = body.get("username");
            senha = body.get("password");
        }
        if (email == null || senha == null) {
            return ResponseEntity.badRequest().body(Map.of("erro","Parâmetros inválidos."));
        }

        Usuario usuario = usuarioService.autenticar(email, senha);
        if (usuario == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("erro","E-mail ou senha inválidos."));
        }

        String role = usuario.getRole() != null ? usuario.getRole() : "USER";
        String token = JwtUtil.generateToken(usuario.getEmail(), role);

        Map<String,String> resp = new HashMap<>();
        resp.put("token", token);
        resp.put("usuario", usuario.getNome());
        resp.put("role", role);

        return ResponseEntity.ok(resp);
    }
}
