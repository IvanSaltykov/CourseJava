package ru.java_course.spring_boot.task_4_12.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.java_course.spring_boot.task_4_12.dto.Message;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MessageController {
    private List<Message> messages = new ArrayList<Message>(Arrays.asList(
            new Message(1, "MessageTest1", "Вроде работает", LocalDateTime.of(2025, 03, 22, 20, 44, 12)),
            new Message(2, "MessageTest2", "Точно работает", LocalDateTime.of(2025, 03, 22, 20, 45, 45)),
            new Message(3, "MessageTest3", "Ну теперь точно работает", LocalDateTime.of(2025, 03, 22, 20, 47, 23))
    ));

    //Возврат списка объектов Message
    @GetMapping("/message")
    public Iterable<Message> getMessages() {
        return messages;
    }

    //Возврат объекта Message по id
    @GetMapping("/message/{id}")
    public Message getMessage(@PathVariable int id) {
        return messages.stream().filter(m -> m.getId() == id).findFirst().get();
    }

    //Добавление объекта Message
    @PostMapping("/message")
    public Message addMessage(@RequestBody Message message) {
        messages.add(message);
        return message;
    }

    //Изменение объекта Message по id
    @PutMapping("/message/{id}")
    public ResponseEntity<Message> updateMessage(@PathVariable int id, @RequestBody Message message) {
        int index = - 1;
        for (Message p : messages) {
            if (p.getId() == id) {
                index = messages.indexOf(p);
                messages.set(index, message);
            }
        }
        return index == -1
                ? new ResponseEntity<>(addMessage(message), HttpStatus.CREATED)
                : new ResponseEntity<>(message, HttpStatus.OK);
    }

    //Удаление объекта Message по id
    @DeleteMapping("/message/{id}")
    public void deleteMessage(@PathVariable int id) {
        messages.removeIf(m -> m.getId() == id);
    }
}
