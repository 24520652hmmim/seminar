package com.example.SE330.controller;

import com.example.SE330.model.Student;
import com.example.SE330.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/register";
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("student", new Student());
        return "register";
    }

    @PostMapping("/register")
    public String submitRegisterForm(Student student, Model model) {
        String error = studentService.validateStudent(student);

        if (error != null) {
            model.addAttribute("error", error);
            model.addAttribute("student", student);
            return "register";
        }

        Student registeredStudent = studentService.registerStudent(student);

        model.addAttribute("student", registeredStudent);
        model.addAttribute("message", "Registration completed successfully!");

        return "result";
    }

    @GetMapping("/students")
    public String showAllStudents(Model model) {
        model.addAttribute("students", studentService.getAllRegisteredStudents());
        return "students";
    }
}