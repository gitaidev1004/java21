package com.example.grade.controller;
import com.example.grade.dao.StudentDAO;
import com.example.grade.model.Student;
import java.util.List;

public class StudentController {
    private final StudentDAO dao = new StudentDAO();

    public void addStudent(String name, double score, String major) {
        if (name == null || name.isBlank() || major == null || major.isBlank() || score < 0 || score > 100) {
            throw new IllegalArgumentException("잘못된 입력입니다. 이름 또는 점수를 확인하세요.");
        }
        dao.insert(new Student(name, score, major));
    }

    public List<Student> listStudents() {
        return dao.selectAll();
    }

    public void updateStudent(int id, String name, double score) {
        dao.update(new Student(id, name, score));
    }

    public void deleteStudent(int id) {
        dao.delete(id);
    }
}