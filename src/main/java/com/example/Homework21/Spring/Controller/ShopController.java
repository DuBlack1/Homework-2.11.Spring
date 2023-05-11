package com.example.Homework21.Spring.Controller;


import com.example.Homework21.Spring.Service.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/store/order")
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

//    http://localhost:8080/store/order/add?id=1,2,3
    @GetMapping(path = "/add")
    public void addItem(@RequestParam(value = "id") Set<Integer> itemIds) {
        shopService.add(itemIds);
    }

    @GetMapping(path = "/get")
    public Object getItems() {
        return shopService.get();
    }
}
