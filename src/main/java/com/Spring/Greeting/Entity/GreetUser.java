package com.Spring.Greeting.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="Greet")
public class GreetUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    public GreetUser(){

    }


    public GreetUser(String message){
        this.message= message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
