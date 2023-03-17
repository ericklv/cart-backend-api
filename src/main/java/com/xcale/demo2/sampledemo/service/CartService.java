package com.xcale.demo2.sampledemo.service;

import com.xcale.demo2.sampledemo.model.Cart;
import com.xcale.demo2.sampledemo.utils.exception.CustomException;

import java.util.List;

public interface CartService {
    Cart getOrder(Long id);

    List<Cart> getAllCarts();

    Cart addCart(Cart cart) throws CustomException;

    void delete(Long id);


}
