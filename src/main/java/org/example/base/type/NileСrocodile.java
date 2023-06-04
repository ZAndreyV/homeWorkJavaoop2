package org.example.base.type;

import org.example.base.Crocodiles;
import org.example.base.interfaces.RunSpeed;
import org.example.base.interfaces.SwimSpeed;

public class NileСrocodile extends Crocodiles implements RunSpeed, SwimSpeed {
    public NileСrocodile(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Rarr";
    }

    @Override
    public int getRunSpeed() {
        return 25;
    }

    @Override
    public String toString() {
        return String.format("Crocodile: %s, Speed: %d, SwimSpeed: %d", super.toString(), getRunSpeed(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 40;
    }
}
