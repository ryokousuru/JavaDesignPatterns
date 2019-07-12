package com.designpatterns.observer2;

import java.util.ArrayList;
import java.util.List;

public class Speedometer {
    private int currentSpeed;
    private List<SpeedometerListener> listeners;

    public Speedometer() {
        currentSpeed = 0;
        listeners = new ArrayList<>();
    } // the end of the constructor

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
        fireSpeedChanged();
    } // the end of the method

    public int getCurrentSpeed() {return currentSpeed;} // the getter

    public void addSpeedometerListener(SpeedometerListener obj) {
        listeners.add(obj);
    }
    public void removeSpeedometerListener(SpeedometerListener obj) {
        listeners.remove(obj);
    }

    private void fireSpeedChanged() {
        SpeedometerEvent speedEvent = new SpeedometerEvent(this, getCurrentSpeed());
        for(SpeedometerListener listen : listeners) {   // for each statement
           listen.speedChange(speedEvent);
        } // the end of the 'for' statement
    } //the end of the method
} // the end of the class
