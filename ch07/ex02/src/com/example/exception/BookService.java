package com.example.exception;

public class BookService {
    private final BookRepository repository = new BookRepository();
    private int balance = 5000;  // 단순 예제용 사용자 잔액
    // 책 조회 메서드
    public String findBook(String id) throws BookNotFoundException {
        return repository.findById(id);  // 예외를 catch하지 않고 상위로 떠넘김 (throws)
    }
    // 잔액 확인 및 출금 메서드
    public void withdraw(int amount) throws InsufficientBalanceException {
        if (balance < amount) {
            // (4) ① throw 키워드 사용
            throw new InsufficientBalanceException("잔액이 부족합니다. 현재 잔액: " + balance);
        }
        balance -= amount;
        System.out.println(amount + "원이 출금되었습니다. 남은 잔액: " + balance);
    }
}