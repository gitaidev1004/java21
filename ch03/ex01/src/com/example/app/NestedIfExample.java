package com.example.app;

public class NestedIfExample {
    public static void main(String[] args){
        int age = 25;
        boolean hasLicense = true;

        if (age >= 20) {
            if (hasLicense) {
                System.out.println("운전 가능");
            } else {
                System.out.println("면허 필요");
            }
        } else {
            System.out.println("미성년자는 운전 불가");
        }
    }
}
