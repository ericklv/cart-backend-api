package com.xcale.demo2.sampledemo.controller;

import com.xcale.demo2.sampledemo.model.Cart;
import com.xcale.demo2.sampledemo.service.CartService;
import com.xcale.demo2.sampledemo.utils.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @Cacheable(value = "carts",key = "#id")
    @GetMapping(path = "/{id}")
    public Cart getOrders(@PathVariable Long id){
        return cartService.getOrder(id);
    }

    @GetMapping(path="/")
    public List<Cart> getOrders(){
        return cartService.getAllCarts();
    }

    @PostMapping(path="/")
    public Cart saveOrder(@RequestBody Cart cart) throws CustomException {
        return cartService.addCart(cart);
    }

    @DeleteMapping(path="/{id}")
    public void deleteOrder(@PathVariable Long id){
        cartService.delete(id);
    }

}
