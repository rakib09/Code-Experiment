package com.extremecoder.sweggerspringboot.controller;

import com.extremecoder.sweggerspringboot.model.Item;
import com.extremecoder.sweggerspringboot.service.ItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.el.PropertyNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/api/item")
public class ItemController {

	private final ItemService itemService;

	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping()
	public List<Item> itemList() {
		return this.itemService.itemList();
	}

	@GetMapping("/{id}")
	public Item getById(@PathVariable("id") Integer id) {
		return this.itemService.getById(id);
	}

	@PostMapping()
	public void save(Item item) {
		this.itemService.save(item);
	}

	@PutMapping()
	public void update(Item newItem) {
		this.itemService.update(newItem);
	}

	@DeleteMapping()
	public void delete(Item item) {
		this.itemService.delete(item);
	}
}