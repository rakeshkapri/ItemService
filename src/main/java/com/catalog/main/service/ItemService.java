package com.catalog.main.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.catalog.main.model.Item;

@Service
public class ItemService {
	public List<Item> getAllItems(){
		Item item1 = Item.builder().id(1).name("item1").build();
		Item item2 = Item.builder().id(1).name("item2").build();
		return Arrays.asList(item1, item2);
	}

}
