package com.study.gb.Seminar03;

import com.study.gb.Seminar03.Model.Student;
import com.study.gb.Seminar03.Model.StudentsGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsGroupIterator implements Iterator<Student> {
    private List<Student> students;
    private int counter;

    public StudentsGroupIterator(StudentsGroup studentsGroup){
        this.students = studentsGroup.getStudentsList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()) return null;
        counter++;
        return students.get(counter);
    }

    @Override
    public void remove() {
        students = new ArrayList<>();
        counter = 0;
    }
}
