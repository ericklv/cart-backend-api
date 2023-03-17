package com.xcale.demo2.sampledemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CART_ITEM")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    private double price;
    @OneToOne(targetEntity = Item.class,fetch = FetchType.EAGER)
    private Item item;

    public CartItem(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
        this.price = item.getPrice();
    }
}
