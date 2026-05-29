package com.example.SE330.model;

public class Student {
    private int id;
    private String registrationCode;
    private String name;
    private String email;
    private String studentId;
    private String course;
    private String studyMode;
    private int fee;
    private String registrationTime;

    public Student() {
    }

    public Student(int id, String registrationCode, String name, String email, String studentId,
            String course, String studyMode, int fee, String registrationTime) {
        this.id = id;
        this.registrationCode = registrationCode;
        this.name = name;
        this.email = email;
        this.studentId = studentId;
        this.course = course;
        this.studyMode = studyMode;
        this.fee = fee;
        this.registrationTime = registrationTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
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

    public String getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
    }
}