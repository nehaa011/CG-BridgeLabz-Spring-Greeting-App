package com.Spring.Greeting.controller;

import com.Spring.Greeting.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getGreeting")
public class GreetServiceController {

    @Autowired
    private GreetingService greetService;

    @GetMapping("/{name}")
    public String greetCon(@PathVariable String name){
        return greetService.greet(name);
    }
}
