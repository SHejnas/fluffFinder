package com.stevenhejnas.flufffinder.persistence;

import com.stevenhejnas.flufffinder.model.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Integer> {
}
