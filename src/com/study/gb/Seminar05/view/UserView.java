package com.study.gb.Seminar05.view;

import com.study.gb.Seminar05.data.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> listT);
}
