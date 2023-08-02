package com.study.gb.Seminar03.Comparator;

import com.study.gb.Seminar03.Model.Stream;

import java.util.Comparator;

public class SteamComporator implements Comparator<Stream> {

    @Override
    public int compare(Stream steam1, Stream steam2) {
        return Integer.compare(steam1.getStudentsGroupList().size(), steam2.getStudentsGroupList().size());
    }
}
