package com.stevenhejnas.flufffinder.controller;

import com.stevenhejnas.flufffinder.model.Animal;
import com.stevenhejnas.flufffinder.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    private final AnimalService animalService;
    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/all")
    public List<Animal> getAllAnimal(){
        return animalService.getAllAnimal();
    }
    @PostMapping
    public Animal createAnimal(@RequestBody Animal animal){
        return animalService.insertAnimal(animal);
    }
}
