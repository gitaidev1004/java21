package com.example.app;

public class TextBlockExample {
    public static void main(String[] args) {
        String json = """
            {
                "name": "함창훈",
                "age": 30,
                "skills": ["Java", "SQL", "Docker"]
            }
            """;
        System.out.println(json);

        String sql = """
            SELECT id, name
            FROM users
            WHERE created >= ?
            ORDER BY name ASC
            """.stripIndent(); // 들여쓰기 제거
        System.out.println(sql);
    }
}