package com.designpatterns.observer2;

import com.designpatterns.observer.Speedometer;

import java.util.Observable;

public class GearBox implements SpeedometerListener {

    @Override
    public void speedChange(SpeedometerEvent event) {
        if (event.getSpeed() <= 5) {
            System.out.println("Now in easy gear");
        } else if (event.getSpeed() <= 10) {
            System.out.println("Now in 2nd gear");
        } else if (event.getSpeed() <= 15) {
            System.out.println("Now in the next gear up");
        } else if (event.getSpeed() <= 20) {
            System.out.println("Now in 4th of July gear");
        } else if (event.getSpeed() <= 25) {
            System.out.println("Now in 5th gear");
        }
    } // end of the method

} // the end of the class
