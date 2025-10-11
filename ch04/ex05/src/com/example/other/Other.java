package com.example.other;
import com.example.base.Base;
public class Other {
    public void tryAccess() {
        Base b = new Base();
        // System.out.println(b.x); // 컴파일 에러: 다른 패키지, 비서브클래스는 접근 불가
    }
}