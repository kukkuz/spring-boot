package com.kukkuz.springboot.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ApplicationMainTest {

    @Test
    public void main() {
        Application.main(new String[] {});
    }
}