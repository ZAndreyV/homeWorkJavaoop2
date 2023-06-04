package org.example.base;

import org.example.base.interfaces.RunSpeed;

public abstract class Lizards extends Reptiles implements RunSpeed {

    public Lizards(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "omnivorous";
    }

}
