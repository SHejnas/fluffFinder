package com.stevenhejnas.flufffinder.persistence;

import com.stevenhejnas.flufffinder.model.Human;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends CrudRepository<Human, Integer> {
}
