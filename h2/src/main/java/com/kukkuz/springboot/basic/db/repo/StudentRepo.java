package com.kukkuz.springboot.basic.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kukkuz.springboot.basic.db.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {

    Student findByEmail(String email);
}
