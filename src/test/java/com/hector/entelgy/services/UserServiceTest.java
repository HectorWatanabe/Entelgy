package com.hector.entelgy.services;

import com.hector.entelgy.models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() {

        List<String> users = userService.getUsers();

        Assertions.assertNotNull(users);

        System.out.println(">>> Users" + users);

    }
}
