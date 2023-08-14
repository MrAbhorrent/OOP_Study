package com.study.gb.Seminar06.view;

import com.study.gb.Seminar06.data.User;

import java.util.List;

/**
 * 4. Interface Segregation Principle:
 * Создан интерфейс в котором определены только методы для отображения используемых методов
 *
 * 5. Dependency Inversion Principle:
 * Создан интерфейс от которого зависят сущности для различных классов
 *
 * @param <T> - класс пройзводный от User
 */
public interface UserView<T extends User> {
    void sendOnConsole(List<T> listT);
}
