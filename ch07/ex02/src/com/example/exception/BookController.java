package com.example.exception;

public class BookController {
    private final BookService service = new BookService();
    public void handleBookSearch(String id) {
        try {
            String bookTitle = service.findBook(id);
            System.out.println("[Controller] 책 검색 성공: " + bookTitle);
        } catch (BookNotFoundException e) {
            // 개발자 메시지를 사용자용 메시지로 변환
            System.out.println("[Controller] 오류: 요청하신 책을 찾을 수 없습니다.");
            System.err.println("[Debug] " + e.getMessage());
        }
    }
    public void handleWithdraw(int amount) {
        try {
            service.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("[Controller] 오류: " + e.getMessage());
        }
    }
}