package edu.spring.data.domain;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    Person findByName(String name, Sort sort);
}
