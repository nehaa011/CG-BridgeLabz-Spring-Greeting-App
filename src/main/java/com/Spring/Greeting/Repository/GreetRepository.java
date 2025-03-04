package com.Spring.Greeting.Repository;

import com.Spring.Greeting.Entity.GreetUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetRepository extends JpaRepository<GreetUser,Long> {

}
