package org.example.base;

import org.example.base.interfaces.Soundable;

public abstract class Reptiles implements Soundable {
    protected String name;
    public Reptiles(String name) {
        this.name = name;
    }

    public abstract String feed();
    public abstract String sound();

    @Override
    public String toString() {
        return String.format("Name: %s, Food: %s", name, feed());
    }
}
