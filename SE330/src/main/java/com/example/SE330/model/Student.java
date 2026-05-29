package com.example.SE330.model;

public class Student {
    private String name;
    private String email;
    private String studentId;
    private String course;
    private String studyMode;
    private int fee;

    public Student() {
    }

    public Student(String name, String email, String studentId, String course, String studyMode, int fee) {
        this.name = name;
        this.email = email;
        this.studentId = studentId;
        this.course = course;
        this.studyMode = studyMode;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudyMode() {
        return studyMode;
    }

    public void setStudyMode(String studyMode) {
        this.studyMode = studyMode;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}