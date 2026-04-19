package com.example.student.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student create(Student s) {
        return repo.save(s);
    }

    public List<Student> getAll() {
        return repo.findAll();
    }
}
