package com.extremecoder.sweggerspringboot.service;
import com.extremecoder.sweggerspringboot.model.Item;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.el.PropertyNotFoundException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class ItemService {
    private static List<Item> itemList = Arrays.asList(
            new Item(1, "Study on Data Structure", new Date(), new Date()),
            new Item(2, "Study on Algorithm", new Date(), new Date()),
            new Item(3, "Study on Java Core", new Date(), new Date()),
            new Item(3, "Study on Spring", new Date(), new Date())
    );
    public List<Item> itemList() {
        return itemList;
    }

    public Item getById(Integer id) {
        return itemList.stream().filter(item -> item.getId().equals(id)).findFirst().orElseThrow(PropertyNotFoundException::new);
    }

    public void save(Item item) {
        itemList.add(item);
    }

    public void update(Item newItem) {
        Item oldItem = getById(newItem.getId());
        int index = itemList.indexOf(oldItem);
        BeanUtils.copyProperties(oldItem, newItem);
        itemList.set(index, newItem);
    }

    public void delete(Item item) {
        itemList.remove(item);
    }
}
