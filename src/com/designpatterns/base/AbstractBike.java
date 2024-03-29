package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public abstract class AbstractBike implements BikeInterface {
    private WheelInterface wheel;
    private BikeColor color;

    protected AbstractBike(WheelInterface wheel, BikeColor color) {
        this.wheel = wheel;
        this.color = color;
    }

    protected AbstractBike(WheelInterface wheel) {
        this(wheel, BikeColor.UNPAINTED);
    }

    @Override
    public WheelInterface getWheel() {
        return wheel;
    }

    @Override
    public BikeColor getColor() {
        return color;
    }

    @Override
    public void paint(BikeColor color) {
        this.color = color;
    }

    @Override
    public float getPrice() {
        return 900.00f;
    }

    @Override
    public void cleanFrame() {
        System.out.println("Cleaning the Frame....");
    }

    @Override
    public void airTires() {
        System.out.println("Airing up both of the tires....");
    }

    @Override
    public void testRide() {
        System.out.println("Just for the fun of it, would you care to go for a test ride?");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " (" + wheel + ", " + color + ", price = $" + getPrice() + ")";

    }
}


