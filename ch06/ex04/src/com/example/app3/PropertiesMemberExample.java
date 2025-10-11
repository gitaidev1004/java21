package com.example.app3;
import java.util.Properties;
import java.io.*;
public class PropertiesMemberExample {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.setProperty("member.1.username", "김기태");
        props.setProperty("member.1.email", "gitai1004@example.com"); // 비밀번호는 평문 저장 금지
        StringWriter writer = new StringWriter(); // 메모리 → 문자열로 저장
        props.store(writer, "Member settings");
        String out = writer.toString();
        System.out.println("--- Stored ---\n" + out);
        Properties loaded = new Properties();  // 문자열 → Properties 로드
        StringReader reader = new StringReader(out);
        loaded.load(reader);
        System.out.println("Loaded username: " + loaded.getProperty("member.1.username"));
    }
}