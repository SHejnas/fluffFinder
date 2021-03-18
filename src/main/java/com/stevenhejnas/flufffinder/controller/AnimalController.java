package com.stevenhejnas.flufffinder.controller;

import com.stevenhejnas.flufffinder.model.Animal;
import com.stevenhejnas.flufffinder.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

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
    @GetMapping("/{id}")
    public Optional<Animal> getAnimalById(@PathVariable Integer id){
        return animalService.getAnimalById(id);
    }
    @GetMapping("/cats")
    public Optional<List<Animal>> getAllCats(){
        return animalService.getAllCats();
    }
    @GetMapping("/dogs")
    public Optional<List<Animal>> getAllDogs(){
        return animalService.getAllDogs();
    }
    @PostMapping
    public Animal createAnimal(@RequestBody Animal animal){
        return animalService.insertAnimal(animal);
    }
    //@PatchMapping
//    @PutMapping("/{id}")
//    public Optional<Animal> updateAnimal(@PathVariable Integer id, @RequestBody Animal animal){
//        return animalService.updateAnimal(id, animal);
//    }

}
