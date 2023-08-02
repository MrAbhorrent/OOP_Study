package com.study.gb.Seminar03.Model;

import com.study.gb.Seminar03.StudentsGroupIterator;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup implements Iterable<Student> {
    private List<Student> students;

    public StudentsGroup() {
        this(new ArrayList<>());
    }

    public StudentsGroup(List<Student> students) {
        setStudents(students);
    }

    public void addStudent(Student student) {
        if (students != null) {
            students.add(student);
        }
    }

    public List<Student> getStudentsList() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "students=" + students +
                '}';
    }

    @Override
    public StudentsGroupIterator iterator() {
        return new StudentsGroupIterator(this);
    }
}
