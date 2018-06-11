package com.kukkuz.springboot.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = Application.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-integration-test.properties")
public class ApplicationTest {

    @Test
    public void contextLoads() throws Exception {}

}