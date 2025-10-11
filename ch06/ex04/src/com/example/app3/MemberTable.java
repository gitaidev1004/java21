package com.example.app3;
import java.util.Enumeration;
import java.util.Hashtable;

public class MemberTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> members = new Hashtable<>();
        members.put(1001, "김기태");
        members.put(1002, "함창훈");
        members.put(1003, "김대철");

        System.out.println("전체 회원 목록: " + members);

        Enumeration<Integer> keys = members.keys();
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            System.out.println("회원번호: " + key + ", 이름: " + members.get(key));
        }
    }
}