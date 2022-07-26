package ru.utts.springcourse.models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Person {
    private int id;
    @NotEmpty(message = "Имя не может быть пустым!")
    @Size(min = 2, max = 100, message = "Имя должно быть от 2 до 100 символов!")
    private String fullName;
    @Min(value = 1900, message = "Год рождения не может быть меньше 1900!")
    @Max(value = 2022, message = "Год рождения не может быть больше 2022!")
    private int yearOfBirth;

    public Person() {

    }

    public Person(int id, String name, int birthDate) {
        this.id = id;
        this.fullName = name;
        this.yearOfBirth = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}