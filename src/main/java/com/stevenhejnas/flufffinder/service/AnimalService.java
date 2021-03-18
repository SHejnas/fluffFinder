package com.stevenhejnas.flufffinder.service;


import com.stevenhejnas.flufffinder.model.Animal;
import com.stevenhejnas.flufffinder.persistence.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;
    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }
    public List<Animal> getAllAnimal(){
        return (List<Animal>) animalRepository.findAll();
    }
    public Animal insertAnimal(Animal animal){
        return animalRepository.save(animal);
    }
}
