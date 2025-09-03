package br.com.restaurante.service;

import br.com.restaurante.entity.Perfil;
import br.com.restaurante.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {
    //Regras de Negócio ficam no pacote de serviços
    @Autowired
    private PerfilRepository perfilRepository;
//Compila transforma arquivo.java em .class -> que faz um bytecode(roda em qualquer SO)
    //bytecode + máquina virtual => Faz o Java ser Multiplataforma
    public Perfil salvar(Perfil perfilNovo){
        return perfilRepository.save(perfilNovo);
    }

    public Iterable<Perfil> listar(){
        return perfilRepository.findAll();
    }
}
