package com.example.grade.view;

import com.example.grade.controller.StudentController;
import com.example.grade.model.Student;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== 학생 관리 프로그램 =====");
            System.out.println("1. 학생 추가");
            System.out.println("2. 전체 조회");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("이름: ");
                        String name = sc.nextLine();
                        System.out.print("학과: ");
                        String major = sc.nextLine();
                        System.out.print("점수: ");
                        double score = sc.nextDouble();
                        controller.addStudent(name, score, major);
                        System.out.println("학생이 추가되었습니다!");
                    }
                    case 2 -> {
                        List<Student> list = controller.listStudents();
                        list.forEach(System.out::println);
                    }
                    case 3 -> {
                        System.out.print("수정할 ID: ");
                        int id = sc.nextInt(); sc.nextLine();
                        System.out.print("새 이름: ");
                        String name = sc.nextLine();
                        System.out.print("새 점수: ");
                        double score = sc.nextDouble();
                        controller.updateStudent(id, name, score);
                        System.out.println("수정 완료!");
                    }
                    case 4 -> {
                        System.out.print("삭제할 ID: ");
                        int id = sc.nextInt();
                        controller.deleteStudent(id);
                        System.out.println("삭제 완료!");
                    }
                    case 0 -> {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    }
                    default -> System.out.println("잘못된 선택입니다.");
                }
            } catch (Exception e) {
                System.out.println("⚠ 오류: " + e.getMessage());
            }
        }
    }
}