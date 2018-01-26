package com.example.plat.service;

import com.example.plat.DemoPlatApplication;
import com.example.plat.model.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoPlatApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void invalid() {
        User user =User.builder().userName("zxn").password("1001").phone("15888541191").build();
        userService.insert(user);
        System.out.println("true = " + true);
    }
}