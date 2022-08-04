package org.fasttrackit.firstspring.first;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        System.out.println("Building car");
        System.out.println(engine);
        this.engine = engine;
    }
}
