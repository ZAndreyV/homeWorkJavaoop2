package org.example.base;

import org.example.base.interfaces.RunSpeed;
import org.example.base.interfaces.Soundable;
import org.example.base.interfaces.SwimSpeed;

import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    Music music = new Music();
    private List<Reptiles> terrarium = new ArrayList<>();

    public Terrarium addReptiles(Reptiles someReptiles){
        terrarium.add(someReptiles);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Reptiles reptiles: terrarium){
            builder.append(reptiles)
                    .append('\n');
        }
        return builder.toString();
    }

    public List<RunSpeed> runners(){
        List<RunSpeed> runners = new ArrayList<>();
        for (Reptiles reptiles: terrarium) {
            if (reptiles instanceof RunSpeed) {
                runners.add((RunSpeed) reptiles);
            }
        }
        return runners;
    }
    public RunSpeed getRunnerChampion(){
        List<RunSpeed> runners = runners();
        RunSpeed champ = runners.get(0);
        for (RunSpeed runner: runners) {
            if (champ.getRunSpeed() < runner.getRunSpeed()) {
                champ = runner;
            }
        }
        return champ;
    }


    private List<Soundable> getSoundable(){
        List<Soundable> result = new ArrayList<>(terrarium);
        result.add(music);
        return result;
    }

    public String getSound() {
        StringBuilder builder = new StringBuilder();
        for (Soundable soundable: getSoundable()) {
            builder.append(soundable.sound()).append('\n');
        }
        return builder.toString();
    }

    public List<SwimSpeed> swimmers() {
        List<SwimSpeed> swimmer = new ArrayList<>();
        for (Reptiles reptiles: terrarium) {
            if (reptiles instanceof SwimSpeed) {
                swimmer.add((SwimSpeed) reptiles);
            }
        }
        return swimmer;
    }

    public SwimSpeed getSwimmerChampion(){
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed champ = swimmers.get(0);
        for (SwimSpeed runner: swimmers) {
            if (champ.getSwimSpeed() < runner.getSwimSpeed()) {
                champ = runner;
            }
        }
        return champ;

}}
