package org.example.base;

import org.example.base.interfaces.RunSpeed;

public abstract class Turtles extends Reptiles implements RunSpeed {
    public Turtles(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "omnivorous";
    }
}
