package com.study.gb.Seminar06.data;

import java.time.LocalDate;

/**
 * 1. Single Responsibility Principle:
 * Класс User решает одну задачу: хранит минимальные атрибуты пользователя - ФИО, день рождения.
 * 2. Open Closed Principle:
 * Класс User содержит параметры, доступ к которым ограничен модификатором private. Для добавления новой фукциональности
 * мы создаем наследников класса Student, Teacher, которые добавляют новую функциональность к классу
 */
public class User {
    private String firstName;
    private String secondName;
    private String patronymic;
    private LocalDate dateOfBirth;

    public User(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    protected String getInfo() {
        return
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth;
    }

    @Override
    public String toString() {
        String[] className = getClass().getName().split("\\.");
        return className[className.length - 1] + "{" +
               getInfo() +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) :
                user.getFirstName() != null) {
            return false;
        }
        if (getSecondName() != null ? !getSecondName().equals(user.getSecondName()) :
                user.getSecondName() != null) {
            return false;
        }
        if (getPatronymic() != null ? !getPatronymic().equals(user.getPatronymic()) :
                user.getPatronymic() != null) {
            return false;
        }
        return getDateOfBirth() != null ? getDateOfBirth().equals(user.getDateOfBirth()) :
                user.getDateOfBirth() == null;
    }
}
