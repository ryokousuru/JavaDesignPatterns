package com.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class GearBox implements Observer {

    @Override
    public void update(Observable obs, Object arg) {
        Speedometer speedo = (Speedometer)obs;
        if(speedo.getCurrentSpeed() <= 5) {
            System.out.println("Now in easy gear");
        }
        else if(speedo.getCurrentSpeed() <=10) {
            System.out.println("Now in 2nd gear");
        }
        else if(speedo.getCurrentSpeed() <=15) {
            System.out.println("Now in the next gear up");
        }
        else if(speedo.getCurrentSpeed() <=20) {
            System.out.println("Now in 4th of July gear");
        }
        else if(speedo.getCurrentSpeed() <=25) {
            System.out.println("Now in 5th gear");
        } // the end of the method
    } // the end of the class
}
