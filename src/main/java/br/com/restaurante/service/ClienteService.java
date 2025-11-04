package br.com.restaurante.service;

import br.com.restaurante.entity.Cliente;
import br.com.restaurante.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente novo){
       return clienteRepository.save(novo);

    }
public Iterable<Cliente> listar(){
        return clienteRepository.findAll();
    }
    public Cliente atualizar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

        public void remover (Long id){
            clienteRepository.deleteById(id);
    }
    public Optional<Cliente>pegarPorId(Long id){
        return clienteRepository.findById(id);
    }


}
