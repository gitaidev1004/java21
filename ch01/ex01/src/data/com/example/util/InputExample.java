package com.example.util;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 주의: 프로그램 끝에서 닫거나 닫지 않음
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.nextLine(); // nextInt() 뒤에 남은 개행 소비
        System.out.printf("안녕하세요, %s님. 나이는 %d세입니다.%n", name, age);
        // sc.close(); // 프로그램 끝에서만 닫을 것 (System.in이 닫힘)
    }
}