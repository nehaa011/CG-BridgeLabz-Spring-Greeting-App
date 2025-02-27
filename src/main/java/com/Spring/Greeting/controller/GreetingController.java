package com.Spring.Greeting.controller;

import com.Spring.Greeting.Model.GreetingDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @GetMapping
    public GreetingDTO greet(){
        return new GreetingDTO("Hello from BridgeLabz!!");
    }

    @PostMapping("/message")
    public GreetingDTO postGreet(@RequestBody GreetingDTO greet){
        return new GreetingDTO("Hello, " + greet.getMessage()+" from BridgeLabz!");
    }

    @PutMapping("/putMessage")
    public GreetingDTO putGreet(@RequestBody GreetingDTO greet){
        return new GreetingDTO("Updated: "+ greet.getMessage());
    }

    @DeleteMapping("/")
    public GreetingDTO deleteGreet(){
        return new GreetingDTO("Message deleted Successfully");
    }

}
