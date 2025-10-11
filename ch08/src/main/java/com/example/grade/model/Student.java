package com.example.grade.model;

public class Student {
    private int id;
    private String name;
    private double score;
    private String major;

    public Student() {}
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
    public Student(String name, double score, String major) {
        this.name = name;
        this.score = score;
        this.major = major;
    }
    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public Student(int id, String name, double score, String major) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.major = major;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getScore() { return score; }
    public String getMajor() { return major; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setScore(double score) { this.score = score; }
    public void setMajor(String major) { this.major = major; }

    @Override
    public String toString() {
        return String.format("[%d] %s %s - %.2f점", id, name, major, score);
    }
}