package com.example.Homework21.Spring.Class;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class Basket {
    private Set<Integer> itemIds;

    public Basket() {
        this.itemIds = new HashSet<>();
    }

    public void add(Set<Integer> itemIds) {
        for (Integer itemId : itemIds) {
            this.itemIds.add(itemId);
        }
    }

    public Set<Integer> getItemIds() {
        return itemIds;
    }
}
