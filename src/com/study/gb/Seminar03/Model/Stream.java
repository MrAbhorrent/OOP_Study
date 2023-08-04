package com.study.gb.Seminar03.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudentsGroup> {

    private final List<StudentsGroup> studentsGroupList;
    private int index;

    public Stream(java.util.List<StudentsGroup> studentsGroupList) {
        this.studentsGroupList = studentsGroupList;
        this.index = -1;
    }

    public Stream() {
        this(new ArrayList<>());
    }

    public List<StudentsGroup> getStudentsGroupList() {
        return studentsGroupList;
    }

    @Override
    public boolean hasNext() {
        return index < studentsGroupList.size() - 1;
    }

    @Override
    public StudentsGroup next() {
        if (!hasNext()) {
            return null;
        }
        return studentsGroupList.get(++index);
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
