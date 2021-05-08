package com.hector.entelgy.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UseReqresRepositoryTest {

    private final UserRepository userRepository;

    @Autowired
    public UseReqresRepositoryTest(@Qualifier("reqres") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    void test() {

        List<String> users = this.userRepository.getAll();

        Assertions.assertNotNull(users);

        System.out.println(">>> Users : " + users);

    }
}
