package com.kukkuz.springboot.basic.db;

import com.kukkuz.springboot.basic.db.model.Student;
import com.kukkuz.springboot.basic.db.repo.StudentRepo;
import com.kukkuz.springboot.basic.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class StudentRepoTest {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void whenFindByEmail_thenReturnEmployee() {
        // given
        Student student = new Student("kukkuz", "kukkuz@gmail.com", "My world", 30);
        entityManager.persist(student);
        entityManager.flush();
        // when
        Student found = studentRepo.findByEmail(student.getEmail());
        // then
        assertThat(found.getName()).isEqualTo(student.getName());
    }
}