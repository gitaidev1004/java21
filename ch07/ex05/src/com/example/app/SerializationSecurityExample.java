package com.example.app;
import java.io.*;

public class SerializationSecurityExample {
    public static void main(String[] args) {
        Member member = new Member("kim", "secret123");

        // 1. 직렬화: 객체 → 파일
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("member.ser"))) {
            oos.writeObject(member);
            System.out.println("[직렬화 완료] " + member);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. 역직렬화: 파일 → 객체
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("member.ser"))) {
            Member deserialized = (Member) ois.readObject();
            System.out.println("[역직렬화 완료] " + deserialized);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 3. 파일 내용 변조 시뮬레이션 (보안 경고 목적)
        try (FileWriter fw = new FileWriter("member.ser", true)) {
            fw.write("MALICIOUS DATA");  // 직렬화 파일에 임의 데이터 삽입
            System.out.println("[파일 변조 완료] 악의적 데이터 추가됨");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. 변조된 파일 역직렬화 시도 → 오류 발생 가능
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("member.ser"))) {
            Member hacked = (Member) ois.readObject();
            System.out.println("[변조 파일 역직렬화] " + hacked);
        } catch (Exception e) {
            System.out.println("[보안 경고] 역직렬화 중 오류 발생: " + e);
        }
    }
}