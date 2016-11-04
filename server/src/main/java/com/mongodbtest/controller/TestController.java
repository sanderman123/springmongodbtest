package com.mongodbtest.controller;

import com.mongodbtest.domain.Person;
import com.mongodbtest.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello world!";
    }

    @GetMapping("/jj")
    public List<Person> jj() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("id", "sander"));
        persons.add(new Person("id", "sander2"));
        return persons;
    }

    @GetMapping("/person")
    public Iterable<Person> person() {
        return personRepository.findAll();
    }

    @PostMapping("/person")
    public Person person(@RequestBody Person person) {
        Person person1 = personRepository.save(person);
        return person1;
//        return new Person("asdf", "sdf");
    }
}
