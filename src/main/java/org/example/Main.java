package org.example;

import org.example.base.*;
import org.example.base.interfaces.RunSpeed;
import org.example.base.interfaces.SwimSpeed;
import org.example.base.type.Komododragon;
import org.example.base.type.Leatherbackturtle;
import org.example.base.type.NileСrocodile;
import org.example.base.type.Tigerpython;

public class Main {
    public static void main(String[] args) {
        Reptiles crocodile = new NileСrocodile("Гена");
        Reptiles lizard = new Komododragon("Ящер");
        Reptiles snake = new Tigerpython("Гад");

        Terrarium terrarium =new Terrarium();
        terrarium.addReptiles(crocodile).addReptiles(lizard).addReptiles(snake).addReptiles(new Leatherbackturtle("Хан"));
        System.out.println(terrarium);

        System.out.println(terrarium.getSound());

        RunSpeed champ = terrarium.getRunnerChampion();
        System.out.println("--Runnner-champion--");
        System.out.println(champ);
        System.out.println("---runners---");
        for (RunSpeed runner: terrarium.runners()) {
            System.out.println(runner);
        }
        System.out.println();

        System.out.println("--Swimmer-champion--");
        System.out.println(terrarium.getSwimmerChampion());
        System.out.println("--swimmers--");
        for (SwimSpeed swimmer: terrarium.swimmers()) {
            System.out.println(swimmer);
        }

    }
}