package com.example.util;

public class SafeSingleton implements java.io.Serializable {
    private static final SafeSingleton INSTANCE = new SafeSingleton();
    private SafeSingleton() {
        if (INSTANCE != null) throw new IllegalStateException("Already created"); // reflection 방어
    }
    public static SafeSingleton getInstance() { return INSTANCE; }
    private Object readResolve() { return INSTANCE; } // 직렬화 후 동일 인스턴스 반환
}