package com.Spring.Greeting.controller;

import com.Spring.Greeting.Entity.GreetUser;
import com.Spring.Greeting.Service.GreetUserService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetUser")
public class GreetUserController {

    @Autowired
    private GreetUserService GService;

    @PostMapping("/save")
    public GreetUser saveGreeting(@RequestParam String message){
        return GService.saveMessage(message);
    }
}
