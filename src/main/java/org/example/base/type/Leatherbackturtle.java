package org.example.base.type;

import org.example.base.interfaces.RunSpeed;
import org.example.base.interfaces.SwimSpeed;
import org.example.base.Turtles;

public class Leatherbackturtle extends Turtles implements RunSpeed, SwimSpeed {
    public Leatherbackturtle(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Wow";
    }

    @Override
    public int getRunSpeed() {
        return 2;
    }

    @Override
    public String toString() {
        return String.format("Turtle: %s, Speed: %d, SwimSpeed: %d", super.toString(), getRunSpeed(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 30;
    }
}
