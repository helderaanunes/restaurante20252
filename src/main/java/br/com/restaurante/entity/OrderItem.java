package br.com.restaurante.entity;


import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Embeddable  // indica que esta classe NÃO é uma tabela, mas faz parte de outra entidade
public class OrderItem {

    private String name;
    private Integer quantity;

    private OrderItem() {
    }

    public OrderItem(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public static OrderItem createOrderItem() {
        return new OrderItem();
    }

    // Getters e Setters

}

