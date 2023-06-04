package org.example.base;

import org.example.base.interfaces.RunSpeed;

public abstract class Crocodiles extends Reptiles implements RunSpeed {
    public Crocodiles(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "meat";
    }
}
