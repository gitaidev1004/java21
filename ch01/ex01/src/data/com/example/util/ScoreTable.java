package com.example.util;
import java.util.Scanner;
public class ScoreTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수: ");
        int n = Integer.parseInt(sc.nextLine().trim()); // nextLine 기반 파싱
        System.out.printf("%-12s %6s %6s %6s %6s%n", "이름", "국어", "영어", "수학", "평균");
        for (int i = 0; i < n; i++) {
            System.out.print("이름: ");
            String name = sc.nextLine().trim();
            System.out.print("국어: ");
            int kor = Integer.parseInt(sc.nextLine().trim());
            System.out.print("영어: ");
            int eng = Integer.parseInt(sc.nextLine().trim());
            System.out.print("수학: ");
            int math = Integer.parseInt(sc.nextLine().trim());
            double avg = (kor + eng + math) / 3.0;
            System.out.printf("%-12s %6d %6d %6d %6.2f%n", name, kor, eng, math, avg);
        }
        // sc.close(); // 프로그램 전체가 끝나면 닫아도 됨, 다른 입력 재사용 시 주의
    }
}