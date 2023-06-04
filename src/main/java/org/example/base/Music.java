package org.example.base;

import org.example.base.interfaces.Soundable;

public class Music implements Soundable {
    @Override
    public String sound() {
        return "Ля-ля-ля";
    }
}
