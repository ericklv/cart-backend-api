package com.xcale.demo2.sampledemo.service.impl;

import com.xcale.demo2.sampledemo.model.Item;
import com.xcale.demo2.sampledemo.repository.ItemRepository;
import com.xcale.demo2.sampledemo.service.ItemService;
import com.xcale.demo2.sampledemo.utils.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    public Item getItemById(Long id){
        return itemRepository
                .findById(id)
                .orElse(null);
    }

    public List<Item> getAll(){
        return StreamSupport.stream(itemRepository.findAll().spliterator(),false)
                .collect(Collectors.toList());
    }

    public Item addItem(Item item){
        return itemRepository.save(item);
    }

    public Item update(Long id, Item item) throws CustomException {
        Item itemUpdated = itemRepository.findById(id).orElseThrow(() -> new CustomException("Not found"));
        itemUpdated.setName(item.getName());
        itemUpdated.setPrice(item.getPrice());
        itemUpdated.setDescription(item.getDescription());
        itemUpdated.setItemType(item.getItemType());
        itemUpdated.setImageUrl(item.getImageUrl());

        return itemRepository.save(itemUpdated);
    }

    public Item updateImage(Long id, Item item) throws CustomException {
        Item itemUpdated = itemRepository.findById(id).orElseThrow(() -> new CustomException("Not found"));
        itemUpdated.setDescription(item.getDescription());
        itemUpdated.setImageUrl(item.getImageUrl());

        return itemRepository.save(itemUpdated);
    }

    public void deleteItem(Long id){ itemRepository.deleteById(id);}
}
