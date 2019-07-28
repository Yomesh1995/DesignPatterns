/*
* Observer Pattern, update latest score to match subscribed audiences
* */
package com.designpatterns.observerpattern;

/**
 * @author yrr
 * 28/07/2019
 */
public class ObserverMain {

    public static void main(String[] args) {
        // Match is a Observable Object that contains it's Audience list and score
        Match m1 = new Match("Ind", "Aus");
        Match m2 = new Match("Pak", "Eng");
        // Audience is a Observer who is interested to get his subscribed matches latest score
        Audience a1 = new Audience("Yomesh");
        Audience a2 = new Audience("Yashpal");
        m1.addObserver(a1);
        m2.addObserver(a2);
        m1.addObserver(a2);
        m1.setScore(12);
        m2.setScore(10);
        m1.setScore(16);
        m2.setScore(10);
        m1.printObserversCount();
        m2.printObserversCount();
        m1.deleteObserver(a1);
        m1.printObserversCount();
        m2.printObserversCount();
    }
}
