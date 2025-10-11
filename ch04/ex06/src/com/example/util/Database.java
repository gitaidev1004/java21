package com.example.util;

import java.sql.Connection;

public enum Database {
    INSTANCE;

    private Connection conn;

    Database() {
        // 생성자에서 초기화 (한 번만 호출)
        // conn = createConnection();
    }

    public Connection getConnection() {
        return conn;
    }
}