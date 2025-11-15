package br.com.restaurante.repository;

import br.com.restaurante.entity.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.restaurante.entity.OrderStatus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {

    @Query(
            value = "SELECT * FROM pedido WHERE status_pedido = 'COMPLETED' ORDER BY id ASC",
            nativeQuery = true
    )
    List<Pedido> buscarPedidosProntos();
}




