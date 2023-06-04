package org.example.base.type;

import org.example.base.Lizards;
import org.example.base.interfaces.RunSpeed;
import org.example.base.interfaces.SwimSpeed;

public class Komododragon extends Lizards implements RunSpeed, SwimSpeed {
    public Komododragon(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Shsh";
    }

    @Override
    public int getRunSpeed() {
        return 29;
    }

    @Override
    public String toString() {
        return String.format("Lizard: %s, Speed: %d, SwimSpeed: %d", super.toString(), getRunSpeed(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 15;
    }
}
