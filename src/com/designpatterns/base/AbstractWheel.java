package com.designpatterns.base;

public abstract class AbstractWheel implements WheelInterface {

    private int size;  //refers to field
    private boolean wide;  //refers to field

    public AbstractWheel(int sizeofwheel, boolean width) {  //constructor; vars refer to parameters
        this.size = sizeofwheel;  //'this' means I'm talking about the class
        this.wide = width;      //and not the parameter
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isWide() {
        return wide;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + " at " + size + " inches";
        }

}
