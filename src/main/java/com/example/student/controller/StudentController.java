package com.example.student.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student create(@RequestBody Student s) {
        System.out.println("HIIIII Iam Karan");
        System.out.println("Namskaram");
        return service.create(s);
    }

    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }
    @GetMapping
    public String getStudentName(){
        System.out.println("HII");
        return "arun";
    }


    public String allianzGermany(){
        return "ABC";
    }
    public String getDept(){
        return "IT";
    }

    public String allianzTestingOne(){
        return "test1";
    }
    public String allianzTestingTwo(){
        return "test2";
    }
    public String getAllianzTest3(){
        return "test3";
    }
    public String getAllianzTest4(){
        return "test4";
    }
}
