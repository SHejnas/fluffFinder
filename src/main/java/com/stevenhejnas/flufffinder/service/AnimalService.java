package com.stevenhejnas.flufffinder.service;


import com.stevenhejnas.flufffinder.Species;
import com.stevenhejnas.flufffinder.model.Animal;
import com.stevenhejnas.flufffinder.persistence.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Animal> getAnimalById(Integer id){
        return animalRepository.findById(id);
    }
    public Animal insertAnimal(Animal animal){
        return animalRepository.save(animal);
    }
    public Optional<List<Animal>> getAllCats(){
        return animalRepository.findBySpecies(Species.CAT);
    }
    public Optional<List<Animal>> getAllDogs(){
        return animalRepository.findBySpecies(Species.DOG);
    }
//    public Optional<Animal> updateAnimal(Integer id, Animal animal){
//        Optional<Animal> optionalAnimal = animalRepository.findById(id);
//        if(optionalAnimal.isPresent()){
//            animalRepository.save(animal);
//        }
//        return optionalAnimal;
//    }
}
