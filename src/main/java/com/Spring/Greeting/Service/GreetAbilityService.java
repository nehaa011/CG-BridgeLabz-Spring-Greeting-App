package com.Spring.Greeting.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetAbilityService {

    public String getGreeting(){
        return "Hello World!";
    }

    public String getGreeting(String firstName, String lastName ){
        if(firstName != null && !firstName.isEmpty() && lastName != null && lastName != null && !lastName.isEmpty()){
            return "Hello, "+ firstName + " "+ lastName+ "!";
        } else if (firstName !=null && !firstName.isEmpty()) {
            return "Hello, "+ firstName + "!";
        } else if (lastName != null && !lastName.isEmpty()) {
            return "Hello, " + lastName + "!";
        } else{
            return getGreeting();
        }
    }

}
