package com.example.app;
import com.example.vo.Student;
import com.example.util.StudentManager;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("김대철", "S001", 87.5));
        manager.addStudent(new Student("김기태", "S002", 92.3));
        manager.addStudent(new Student("함창훈", "S003", 78.9));

        System.out.println("=== 학생 목록 ===");
        manager.showAllStudents();

        System.out.printf("평균 점수: %.2f%n", manager.getAverageScore());
        System.out.println("최고 점수 학생: " + manager.getTopStudent());
    }
}