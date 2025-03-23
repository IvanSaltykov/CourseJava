package ru.java_course.spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.java_course.spring_boot.dto.Person;
import ru.java_course.spring_boot.repository.PersonRepository;
import java.util.Optional;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository repository;

    //Возврат списка объектов Person
    @GetMapping("/person")
    public Iterable<Person> getPersons() {
        return repository.findAll();
    }

    //Возврат объекта Person по id
    @GetMapping("/person/{id}")
    public Optional<Person> findPersonById(@PathVariable int id) {
        return repository.findById(id);
    }

    //Добавление объекта Person
    @PostMapping("/person")
    public Person addPerson(@RequestBody Person person) {
        repository.save(person);
        return person;
    }

    //Изменение объекта Person по id
    @PutMapping("/person/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable int id, @RequestBody Person person) {
        HttpStatus status = repository.existsById(id) ? HttpStatus.OK : HttpStatus.CREATED;
        return new ResponseEntity(
                repository.save(
                        new Person(
                                id,
                                person.getFirstname(),
                                person.getSurname(),
                                person.getLastname(),
                                person.getBirthday()
                        )
                ), status
        );
    }

    //Удаление объекта Person по id
    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable int id) {
        repository.deleteById(id);
    }
}
