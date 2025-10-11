package com.example.app;

import java.nio.charset.StandardCharsets;
import java.text.Normalizer;

public class CharsetExample {
    public static void main(String[] args) {
        String original = "한글: 가"; // contains multibyte chars
        byte[] bytes = original.getBytes(StandardCharsets.UTF_8);
        String recovered = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(recovered);

        // emoji and code points
        String emoji = "👩‍💻"; // ZWJ sequence
        System.out.println("length (chars): " + emoji.length());
        System.out.println("codePoints count: " + emoji.codePoints().count());

        // normalization example
        String composed = "é"; // could be single codepoint
        String decomposed = "e\u0301"; // 'e' + combining acute
        System.out.println(Normalizer.isNormalized(composed, Normalizer.Form.NFC));
        System.out.println(Normalizer.isNormalized(decomposed, Normalizer.Form.NFC));
        String norm = Normalizer.normalize(decomposed, Normalizer.Form.NFC);
        System.out.println(norm.equals(composed)); // true
    }
}