package com.example.Homework21.Spring.Service;

import java.util.Set;

public interface ShopService {
    void add(Set<Integer> itemId);
    Set<Integer> get();
}
