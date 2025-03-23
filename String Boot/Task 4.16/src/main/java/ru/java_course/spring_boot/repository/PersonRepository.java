package ru.java_course.spring_boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.java_course.spring_boot.dto.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
