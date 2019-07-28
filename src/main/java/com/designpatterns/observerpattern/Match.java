package com.designpatterns.observerpattern;

import java.util.Observable;
import java.util.Observer;

public class Match extends Observable {
    private int score;
    private String team1;
    private String team2;

    public Match(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        System.out.println(match()+ " score update");
        if(this.score != score) {
            this.score = score;
            this.setChanged();
            this.notifyObservers();
        }
    }

    private String match(){
        return team1 + " vs " + team2;
    }

    public void printObserversCount(){
        System.out.println("Total audience getting latest score of match "+match()+" is: "+this.countObservers());
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        System.out.println(((Audience)o).getName()+ " unsubscribed to "+ match());
        super.deleteObserver(o);
    }

    @Override
    public synchronized void addObserver(Observer o) {
        System.out.println(((Audience)o).getName()+ " subscribed for "+ match());
        super.addObserver(o);
    }
}
