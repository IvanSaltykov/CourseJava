package ru.java_course.spring_boot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Message {
    @Id
    @GeneratedValue
    int id;
    String title;
    String text;
    LocalDateTime time;

    public Message(int id, String title, String text, LocalDateTime time) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.time = time;
    }

    public Message() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
