package com.example.ecrappdemo.controller;

import com.example.ecrappdemo.service.FruitService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
public class FruitController {

    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping("/getfruits")
    public List<HashMap<String, String>> getAllFruits() {
        return fruitService.getAllFruits();
    }

    @GetMapping("/getfruit")
    public Optional<HashMap<String, String>> getFruit(@RequestParam String name) {
        return fruitService.getFruit(name);
    }
}