package com.xcale.demo2.sampledemo.service;

import com.xcale.demo2.sampledemo.model.Cart;
import com.xcale.demo2.sampledemo.model.CartItem;
import com.xcale.demo2.sampledemo.model.Item;
import com.xcale.demo2.sampledemo.repository.CartRepository;
import com.xcale.demo2.sampledemo.repository.ItemRepository;
import com.xcale.demo2.sampledemo.utils.exception.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Slf4j
@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    ItemRepository itemRepository;

    public Cart getOrder(Long id){
        return cartRepository
                .findById(id)
                .orElse(null);
    }

    public List<Cart> getAllCarts(){
        return StreamSupport.stream(cartRepository.findAll().spliterator(),false)
                .collect(Collectors.toList());
    }

    public Cart addCart(Cart cart) throws CustomException {
        try {
            cart.getCartItemList().stream().forEach(x -> addCartItems(x));
            cart.getAmount();
            cart.setCreatedAt(new Date());
            return cartRepository.save(cart);
        }catch(Exception e){
            log.error(e.getMessage());
            throw new CustomException("Cannot save cart");
        }

    }

    public void delete(Long id){
        cartRepository.deleteById(id);
    }

    private void addCartItems(CartItem x){
        Item item = itemRepository.findById(x.getItem().getId()).get();
        x.setPrice(item.getPrice());
        x.setItem(item);
    }
}
