package com.example.Homework21.Spring.Service;

import com.example.Homework21.Spring.Class.Basket;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ShopServiceImpl implements ShopService{

    private Basket basket;

    public ShopServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void add(Set<Integer> itemIds) {
        if (basket == null) {
            Basket basket = new Basket();
        }
        basket.add(itemIds);
    }

    @Override
    public Set<Integer> get() {
        return basket.getItemIds();
    }
}
