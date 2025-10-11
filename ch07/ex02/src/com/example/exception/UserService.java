package com.example.exception;

public class UserService {
    public void register(String name) throws InvalidUserInputException {
        if (name == null || name.isBlank())
            throw new InvalidUserInputException("사용자 이름은 비어 있을 수 없습니다.");
        System.out.println("등록 완료: " + name);
    }
}