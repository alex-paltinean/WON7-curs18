package org.fasttrackit.firstweb;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hello")
public class HelloController {

    //PersonService
    @GetMapping
    String sayHello() {
        System.out.println("Calling sayHello()");
        return "Hello";
    }

    @GetMapping("persons")
    List<Person> getPersons() {

        // return personService.getPersons();
        return List.of(
                new Person("Ana", 12),
                new Person("George", 24),
                new Person("Alex", 50)
        );
    }

    @GetMapping("persons/{personId}")
    Person getPerson(@PathVariable int personId,
                     @RequestParam(required = false) String name,
                     @RequestParam(required = false) Integer increase) {
        return new Person(name != null ? name : "No name", personId + (increase != null ? increase : 0));
    }

}

record Person(String name, int age) {

}
