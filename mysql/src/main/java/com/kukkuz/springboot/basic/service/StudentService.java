package com.kukkuz.springboot.basic.service;

import com.kukkuz.springboot.basic.db.model.Student;
import com.kukkuz.springboot.basic.db.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }
}