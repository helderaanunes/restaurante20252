package br.com.restaurante.service;

import br.com.restaurante.entity.Pagamento;
import br.com.restaurante.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository pagamentoRepository;

    public Pagamento salvar(Pagamento novo){
        return pagamentoRepository.save(novo);
    }
    public Iterable<Pagamento> listar(){
        return pagamentoRepository.findAll();
    }
}
