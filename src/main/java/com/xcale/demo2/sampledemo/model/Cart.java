package com.xcale.demo2.sampledemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "CART")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double price;
    private double discounts;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @OneToMany(targetEntity = CartItem.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<CartItem> cartItemList;

    public void getAmount(){
        Double price = this.cartItemList.stream().mapToDouble(x -> x.getPrice()*x.getQuantity()).sum();
        setPrice(price);
    }
}
