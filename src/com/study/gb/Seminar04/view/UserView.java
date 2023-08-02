package com.study.gb.Seminar04.view;

import com.study.gb.Seminar04.data.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> listT);
}
