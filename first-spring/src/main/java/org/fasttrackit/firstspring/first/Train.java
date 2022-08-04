package org.fasttrackit.firstspring.first;

import org.fasttrackit.firstspring.FirstSpringApplication;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Train {
    private final Engine engine;

    private final FirstSpringApplication.Person conductor;

    public Train(Engine engine, @Qualifier("myPerson") FirstSpringApplication.Person conductor) {
        this.engine = engine;
        this.conductor = conductor;
    }
}
