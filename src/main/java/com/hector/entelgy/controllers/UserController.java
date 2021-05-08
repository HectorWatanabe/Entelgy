package com.hector.entelgy.controllers;

import com.hector.entelgy.helpers.JsonResponse;
import com.hector.entelgy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public JsonResponse users() {
        return new JsonResponse(this.userService.getUsers());
    }

}
