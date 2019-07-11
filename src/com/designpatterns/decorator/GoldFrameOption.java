package com.designpatterns.decorator;

import com.designpatterns.base.BikeInterface;

public class GoldFrameOption extends AbstractBikeOption {

    public GoldFrameOption(BikeInterface bike) { super(bike);}

    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 400.00F;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " (" + getWheel() + ", Gold Price = $" + getPrice() + ")";
    }
}
