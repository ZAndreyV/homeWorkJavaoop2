package org.example.base.type;

import org.example.base.interfaces.RunSpeed;
import org.example.base.Snakes;
import org.example.base.interfaces.SwimSpeed;

public class Tigerpython extends Snakes implements RunSpeed, SwimSpeed {
    public Tigerpython(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "SHhhhh";
    }

    @Override
    public int getRunSpeed() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("Snake: %s, Speed: %s, SwimSpeed: %d", super.toString(), getRunSpeed(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 2;
    }
}
