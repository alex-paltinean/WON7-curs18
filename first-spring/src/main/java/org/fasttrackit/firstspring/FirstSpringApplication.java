package org.fasttrackit.firstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class FirstSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringApplication.class, args);
    }

    @Bean
    Person myPerson() {
        return new Person("name");
    }

    @Bean
    Person anotherPerson(){
        return new Person("another");
    }

    public record Person(String name) {

    }

}

