package com.example.ecrappdemo.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FruitService {

    public List<HashMap<String, String>> fruits = new ArrayList<>(
            List.of(
                    new HashMap<>(Map.of("name", "Apple")),
                    new HashMap<>(Map.of("name", "Banana")),
                    new HashMap<>(Map.of("name", "Mango")),
                    new HashMap<>(Map.of("name", "Orange")),
                    new HashMap<>(Map.of("name", "Grapes"))
            )
    );

    public List<HashMap<String, String>> getAllFruits() {
        return fruits;
    }

    public Optional<HashMap<String, String>> getFruit(String name) {
        return fruits.stream()
                .filter(frt -> frt.get("name")
                        .toLowerCase()
                        .startsWith(name.toLowerCase()))
                .findFirst();
    }
}