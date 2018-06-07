package com.kukkuz.springboot.basic.controller;

import com.kukkuz.springboot.basic.db.model.Student;
import com.kukkuz.springboot.basic.db.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/")
    public List<Student> students() {
        return studentRepo.findAll();
    }
}