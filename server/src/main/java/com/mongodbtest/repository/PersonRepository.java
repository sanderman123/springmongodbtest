package com.mongodbtest.repository;

import com.mongodbtest.domain.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {
//    List<Person> findAll();
//    Person findByName(String name);
//    Person addPerson(Person person);
}
