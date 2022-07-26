package ru.utts.springcourse.models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Book {
    private int id;
    @NotEmpty(message = "Книга не может быть без названия!")
    @Size(min = 2, max = 100, message = "Название книги должно быть от 2 до 100 символов!")
    private String title;
    @NotEmpty(message = "Имя автора не может быть пустым!")
    @Size(min = 2, max = 100, message = "Имя автора должно быть от 2 до 100 символов!")
    private String author;
    @Min(value = 0, message = "Год издания книги не может быть меньше 0!")
    private int year;

    public Book() {
    }

    public Book(String name, String author, int year) {
        this.title = name;
        this.author = author;
        this.year = year;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
