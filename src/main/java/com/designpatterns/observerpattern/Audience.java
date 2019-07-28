package com.designpatterns.observerpattern;

import java.util.Observable;
import java.util.Observer;

public class Audience implements Observer {
    private String name;

    public Audience(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Match m = (Match) o;
        System.out.println("Hi " + this.name + " latest score of match " + m.getTeam1() + " vs " + m.getTeam2() + " is: " + m.getScore());
    }
}
