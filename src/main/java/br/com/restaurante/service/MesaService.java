package br.com.restaurante.service;


import br.com.restaurante.entity.Mesa;
import br.com.restaurante.repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MesaService {
    @Autowired

    private MesaRepository mesaRepository;

    public Mesa salvar(Mesa novo){
         return mesaRepository.save(novo);
    }
 public Iterable<Mesa> listar(){
        return mesaRepository.findAll();
 }
 public Mesa atualizar (Mesa mesa){
        return mesaRepository.save(mesa);
 }
 public void remover (Long id){
        mesaRepository.deleteById(id);
 }
 public Optional<Mesa> pegarPorId(Long id){
        return mesaRepository.findById(id);
 }

}
