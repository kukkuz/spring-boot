package com.kukkuz.springboot.basic.service;

import com.kukkuz.springboot.basic.db.model.Student;
import com.kukkuz.springboot.basic.db.repo.StudentRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
public class StudentServiceTest {

    @TestConfiguration
    static class Config {

        @Bean
        public StudentService service() {
            return new StudentService();
        }
    }

    @MockBean
    private StudentRepo studentRepo;

    @Autowired
    private StudentService service;

    @Before
    public void setUp() {
        Student student = new Student();
        student.setName("kukkuz");
        student.setEmail("kukkuz@gmail.com");
        student.setAddress("My world");
        student.setAge(30);
        Mockito.when(studentRepo.findAll()).thenReturn(Arrays.asList(student));
    }

    @Test
    public void whenValidName_thenEmployeeShouldBeFound() {
        Student student = new Student("kukkuz", "kukkuz@gmail.com", "My world", 30);
        List<Student> found = service.getStudents();
        assertThat(found.size()).isEqualTo(1);
        assertThat(found.get(0).getName()).isEqualTo(student.getName());
    }
}