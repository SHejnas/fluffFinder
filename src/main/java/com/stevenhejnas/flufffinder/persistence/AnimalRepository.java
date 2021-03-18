package com.stevenhejnas.flufffinder.persistence;

import com.stevenhejnas.flufffinder.Species;
import com.stevenhejnas.flufffinder.model.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Integer> {

    Optional<List<Animal>> findBySpecies(Species species);
}
