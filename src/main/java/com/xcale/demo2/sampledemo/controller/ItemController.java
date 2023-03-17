package com.xcale.demo2.sampledemo.controller;

import com.xcale.demo2.sampledemo.model.Item;
import com.xcale.demo2.sampledemo.service.ItemService;
import com.xcale.demo2.sampledemo.utils.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping(path = "/{id}")
    public Item getItems(@PathVariable Long id){
        return itemService.getItemById(id);
    }

    @GetMapping(path="/")
    public List<Item> getItems(){
        return itemService.getAll();
    }

    @PostMapping(path="/")
    public Item saveItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    @PutMapping(path="/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item item) throws CustomException {
        return itemService.update(id, item);
    }

    @PutMapping(path="/{id}/extras")
    public Item updateExtras(@PathVariable Long id, @RequestBody Item item) throws CustomException {
        return itemService.update(id, item);
    }

    @DeleteMapping(path="/{id}")
    public void delete(@PathVariable Long id){
        itemService.deleteItem(id);
    }
}
