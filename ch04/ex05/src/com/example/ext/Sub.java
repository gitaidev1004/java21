package com.example.ext;
import com.example.base.Base;
public class Sub extends Base {
    public void printX() {
        System.out.println(this.x); // protected 멤버 접근 허용 (상속 관계)
    }
}