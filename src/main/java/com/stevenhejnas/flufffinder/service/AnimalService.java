package com.stevenhejnas.flufffinder.service;


import com.stevenhejnas.flufffinder.PetNotFoundException;
import com.stevenhejnas.flufffinder.Species;
import com.stevenhejnas.flufffinder.model.Animal;
import com.stevenhejnas.flufffinder.persistence.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.Instant;
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
    public Animal getAnimalById(Integer id){
        return animalRepository.findById(id)
                .orElseThrow(() -> new PetNotFoundException(id));
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

    public Animal updateAnimal(Integer id, Animal animal){
        animalRepository.findById(id)
                .orElseThrow(()-> new PetNotFoundException(id));
            return animalRepository.save(animal);
    }
    public void deleteAnimal(Integer id) {
        animalRepository.deleteById(id);
    }
}
