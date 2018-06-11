package com.kukkuz.springboot.basic.controller;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.kukkuz.springboot.basic.db.model.Student;
import com.kukkuz.springboot.basic.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@WebMvcTest(Controller.class)
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentService service;

    @Before
    public void setUp() {
        Student student = new Student("kukkuz", "kukkuz@gmail.com", "My world", 30);
        Mockito.when(service.getStudents()).thenReturn(Arrays.asList(student));
    }

    @Test
    public void givenEmployees_whenGetEmployees_thenReturnJsonArray() throws Exception {
        Student student = new Student("kukkuz", "kukkuz@gmail.com", "My world", 30);
        List<Student> allEmployees = Arrays.asList(student);
        given(service.getStudents()).willReturn(allEmployees);
        mockMvc.perform(get("/")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name", is(student.getName())));
    }

}