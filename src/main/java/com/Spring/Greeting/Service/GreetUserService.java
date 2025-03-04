package com.Spring.Greeting.Service;


import com.Spring.Greeting.Entity.GreetUser;
import com.Spring.Greeting.Repository.GreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetUserService {

    @Autowired
    public GreetRepository greetRepo;

    public GreetUser saveMessage(String message){
        GreetUser greeting = new GreetUser(message);
        return greetRepo.save(greeting);
    }
}
