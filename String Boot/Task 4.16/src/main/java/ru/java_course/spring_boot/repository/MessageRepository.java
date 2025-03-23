package ru.java_course.spring_boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.java_course.spring_boot.dto.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {
}
