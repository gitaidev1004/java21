package com.example.util;
import com.example.vo.Student;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showAllStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student findStudentByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public double getAverageScore() {
        double sum = 0;
        for (Student s : students) sum += s.getScore();
        return students.isEmpty() ? 0 : sum / students.size();
    }

    public Student getTopStudent() {
        Student top = null;
        for (Student s : students) {
            if (top == null || s.getScore() > top.getScore()) {
                top = s;
            }
        }
        return top;
    }
}