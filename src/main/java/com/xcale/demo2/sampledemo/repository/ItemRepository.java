package com.xcale.demo2.sampledemo.repository;

import com.xcale.demo2.sampledemo.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item,Long> {}
