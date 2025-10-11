package com.example.app;

import java.util.regex.*;

public class StringApiExample {
    public static void main(String[] args) {
        String text = "User: 김기태, Age: 30; User: Bob, Age: 25";
        // simple split
        String[] parts = text.split("; ");
        for (String p : parts) System.out.println(p);

        // substring/indexOf usage
        int idx = text.indexOf("Age:");
        String ageFragment = text.substring(idx, idx + 7);
        System.out.println("fragment: " + ageFragment);

        // regex: extract ages
        Pattern p = Pattern.compile("Age: (\\d+)");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println("Found age: " + m.group(1));
        }

        // replaceAll (regex)
        String anonym = text.replaceAll("User: \\w+", "User: [REDACTED]");
        System.out.println(anonym);
    }
}