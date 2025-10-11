package com.example.util;
public class Config {
    private Config() { /* private 생성자 */ }

    private static class Holder {
        static final Config INSTANCE = new Config();
    }

    public static Config getInstance() {
        return Holder.INSTANCE; // lazy & thread-safe
    }
}