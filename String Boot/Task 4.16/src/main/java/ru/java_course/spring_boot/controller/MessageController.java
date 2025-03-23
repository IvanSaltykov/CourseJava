package ru.java_course.spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.java_course.spring_boot.dto.Message;
import ru.java_course.spring_boot.repository.MessageRepository;
import java.util.Optional;

@RestController
public class MessageController {
    @Autowired
    MessageRepository repository;

    //Возврат списка объектов Message
    @GetMapping("/message")
    public Iterable<Message> getMessages() {
        return repository.findAll();
    }

    //Возврат объекта Message по id
    @GetMapping("/message/{id}")
    public Optional<Message> getMessage(@PathVariable int id) {
        return repository.findById(id);
    }

    //Добавление объекта Message
    @PostMapping("/message")
    public Message addMessage(@RequestBody Message message) {
        repository.save(message);
        return message;
    }

    //Изменение объекта Message по id
    @PutMapping("/message/{id}")
    public ResponseEntity<Message> updateMessage(@PathVariable int id, @RequestBody Message message) {
        HttpStatus status = repository.existsById(id) ? HttpStatus.OK : HttpStatus.CREATED;
        return new ResponseEntity(
                repository.save(
                        new Message(
                                id,
                                message.getTitle(),
                                message.getText(),
                                message.getTime()
                        )
                ), status
        );
    }

    //Удаление объекта Message по id
    @DeleteMapping("/message/{id}")
    public void deleteMessage(@PathVariable int id) {
        repository.deleteById(id);
    }
}
