package com.example.exception;

public class ExceptionApp {
    public static void main(String[] args) {
        BookController controller = new BookController();

        // (3) ① 계층 간 예외 전달 + ② 메시지 변환 예시
        controller.handleBookSearch("100"); // 존재하는 책
        controller.handleBookSearch("999"); // 존재하지 않는 책 → BookNotFoundException 발생

        // (4) ① throw / ② throws 예시
        controller.handleWithdraw(3000);  // 정상 출금
        controller.handleWithdraw(3000);  // 잔액 부족 예외 발생
    }
}