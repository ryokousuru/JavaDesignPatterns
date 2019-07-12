package com.designpatterns.observer;

import java.util.Observable;

public class Speedometer extends Observable {
    private int currentSpeed;

    public Speedometer() {
        currentSpeed = 0;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    } // the end of the getter method

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;

        setChanged();
        notifyObservers();
    }
} // the end of the class
