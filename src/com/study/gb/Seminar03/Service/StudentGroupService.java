package com.study.gb.Seminar03.Service;

import com.study.gb.Seminar03.Comparator.UserComparator;
import com.study.gb.Seminar03.Model.Student;
import com.study.gb.Seminar03.Model.StudentsGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private StudentsGroup studentGroup;

    public StudentGroupService(StudentsGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudentGroupService() {
        this(new StudentsGroup());
    }

    public void setStudentGroup(StudentsGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudentsGroup getStudentGroup() {
        return studentGroup;
    }


    public Student getStudentFromStudentGroup(String firstName, String secondName){
        Iterator<Student> iterator = studentGroup.iterator();
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public void sortStudentsByID() {
        Collections.sort(studentGroup.getStudentsList());
    }

    public void sortStudentsByName() {
        studentGroup.getStudentsList().sort(new UserComparator<>());
    }
}
