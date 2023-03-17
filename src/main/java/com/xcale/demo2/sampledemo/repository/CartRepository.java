package com.xcale.demo2.sampledemo.repository;

import com.xcale.demo2.sampledemo.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepository extends CrudRepository<Cart,Long> {

}
