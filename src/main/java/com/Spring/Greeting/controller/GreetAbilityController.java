package com.Spring.Greeting.controller;

import com.Spring.Greeting.Service.GreetAbilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetAbilityController {

    @Autowired
    private GreetAbilityService greetAbilityService;

    @GetMapping
    public String greeting(){
        return greetAbilityService.getGreeting();
    }

    @GetMapping("/person")
    public String greeting(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName){
        return greetAbilityService.getGreeting(firstName, lastName);
    }
}
