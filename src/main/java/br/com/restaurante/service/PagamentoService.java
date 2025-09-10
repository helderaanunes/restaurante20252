package br.com.restaurante.service;

import br.com.restaurante.entity.Pagamento;
import br.com.restaurante.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Pagamento atualizar(Pagamento pagamento){
        return pagamentoRepository.save(pagamento);
    }
    public void remover (Long id){
        pagamentoRepository.deleteById(id);
    }
    public Optional<Pagamento> pegarPorId(Long id){
        return pagamentoRepository.findById(id);
    }
}
