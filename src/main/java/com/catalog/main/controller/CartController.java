package com.catalog.main.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalog.main.model.Item;
import com.catalog.main.service.ItemService;

@RestController
public class CartController {
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/items")
	public List<Item> getItems() {
		return itemService.getAllItems();
	}

}
