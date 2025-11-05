package br.com.restaurante.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/teste")
    public String testeAdmin() {
        return "✅ Acesso liberado: você tem perfil ADMIN!";
    }
}
