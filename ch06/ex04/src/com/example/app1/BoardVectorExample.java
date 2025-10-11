package com.example.app1;
import java.util.Vector;
import java.util.Enumeration;

record BoardPost(int id, String title, String author, String content) {}

public class BoardVectorExample {
    public static void main(String[] args) {
        Vector<BoardPost> board = new Vector<>(); // 동기화된 리스트
        board.add(new BoardPost(1, "안내", "관리자", "환영합니다."));
        board.add(new BoardPost(2, "공지", "관리자", "업데이트 예정"));
        board.insertElementAt(new BoardPost(3, "자유게시판", "홍길동", "첫글!"), 1);

        // 열거자(legacy) 사용 예
        Enumeration<BoardPost> en = board.elements();
        while (en.hasMoreElements()) {
            BoardPost p = en.nextElement();
            System.out.println(p);
        }

        // 특정 인덱스 조회/삭제
        BoardPost p2 = board.elementAt(1); // 인덱스 1
        board.removeElementAt(2);
    }
}