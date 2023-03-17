package com.xcale.demo2.sampledemo.service;

import com.xcale.demo2.sampledemo.model.Item;
import com.xcale.demo2.sampledemo.utils.exception.CustomException;

import java.util.List;

public interface ItemService {

    Item getItemById(Long id);

    List<Item> getAll();

    Item addItem(Item item);

    Item update(Long id, Item item) throws CustomException;

    Item updateImage(Long id, Item item) throws CustomException;

    void deleteItem(Long id);
}
