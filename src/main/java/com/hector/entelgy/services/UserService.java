package com.hector.entelgy.services;

import com.hector.entelgy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(@Qualifier("reqres") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<String> getUsers() {
        return userRepository.getAll();
    }
}
