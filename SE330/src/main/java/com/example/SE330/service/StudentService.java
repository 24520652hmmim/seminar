package com.example.SE330.service;

import com.example.SE330.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> registeredStudents = new ArrayList<>();

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

        if (student.getCourse() == null || student.getCourse().trim().isEmpty()) {
            return "Please select a course.";
        }

        if (student.getStudyMode() == null || student.getStudyMode().trim().isEmpty()) {
            return "Please select a study mode.";
        }

        return null;
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
        int fee = calculateFee(student.getCourse());
        student.setFee(fee);

        registeredStudents.add(student);

        return student;
    }

    public List<Student> getAllRegisteredStudents() {
        return registeredStudents;
    }
}