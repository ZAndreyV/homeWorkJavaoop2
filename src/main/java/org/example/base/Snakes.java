package org.example.base;

public abstract class Snakes extends Reptiles{
    public Snakes(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "meat";
    }
}
