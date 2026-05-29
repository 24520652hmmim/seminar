package com.example.SE330.service;

import com.example.SE330.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> registeredStudents = new ArrayList<>();
    private int nextId = 1;

    public String validateStudent(Student student) {
        if (student.getName() == null || student.getName().trim().isEmpty()) {
            return "Name cannot be empty.";
        }

        if (student.getEmail() == null || !student.getEmail().contains("@")) {
            return "Email must be valid.";
        }

        if (student.getStudentId() == null || student.getStudentId().trim().isEmpty()) {
            return "Student ID cannot be empty.";
        }

        if (isDuplicateStudentId(student.getStudentId())) {
            return "Student ID already exists.";
        }

        if (student.getCourse() == null || student.getCourse().trim().isEmpty()) {
            return "Please select a course.";
        }

        if (student.getStudyMode() == null || student.getStudyMode().trim().isEmpty()) {
            return "Please select a study mode.";
        }

        return null;
    }

    public boolean isDuplicateStudentId(String studentId) {
        for (Student student : registeredStudents) {
            if (student.getStudentId().equalsIgnoreCase(studentId)) {
                return true;
            }
        }
        return false;
    }

    public int calculateFee(String course) {
        if ("Spring Architecture".equals(course)) {
            return 300;
        } else if ("Java Backend".equals(course)) {
            return 250;
        } else if ("Database System".equals(course)) {
            return 220;
        } else if ("Software Engineering".equals(course)) {
            return 280;
        }

        return 0;
    }

    public Student registerStudent(Student student) {
        student.setId(nextId);
        student.setRegistrationCode(String.format("REG%03d", nextId));
        student.setFee(calculateFee(student.getCourse()));
        student.setRegistrationTime(getCurrentTime());

        registeredStudents.add(student);
        nextId++;

        return student;
    }

    public List<Student> getAllRegisteredStudents() {
        return registeredStudents;
    }

    public void deleteStudent(int id) {
        registeredStudents.removeIf(student -> student.getId() == id);
    }

    public int getTotalStudents() {
        return registeredStudents.size();
    }

    public int getOnlineStudents() {
        int count = 0;

        for (Student student : registeredStudents) {
            if ("Online".equalsIgnoreCase(student.getStudyMode())) {
                count++;
            }
        }

        return count;
    }

    public int getOfflineStudents() {
        int count = 0;

        for (Student student : registeredStudents) {
            if ("Offline".equalsIgnoreCase(student.getStudyMode())) {
                count++;
            }
        }

        return count;
    }

    public int getTotalRevenue() {
        int total = 0;

        for (Student student : registeredStudents) {
            total += student.getFee();
        }

        return total;
    }

    private String getCurrentTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return LocalDateTime.now().format(formatter);
    }
}