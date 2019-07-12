package com.designpatterns.observer2;

public class SpeedMonitor implements SpeedometerListener {
    public static final int SPEED_TO_ALERT = 30;

    @Override
    public void speedChange(SpeedometerEvent event) {
        if (event.getSpeed() > SPEED_TO_ALERT) {
            System.out.println("++ ALERT ++ Riding way too fast!! :-O ("
            + event.getSpeed() + ")");
        }
        else {
            System.out.println("....nice and easy does it....("
            + event.getSpeed() + ")");
        }

    }
}
