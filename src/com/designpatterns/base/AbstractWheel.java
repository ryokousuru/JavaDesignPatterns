package com.designpatterns.base;

import com.designpatterns.observer.Speedometer;
import com.designpatterns.visitor.Bearings;
import com.designpatterns.visitor.Spokes;
import com.designpatterns.visitor.WheelVisitorInterface;

public abstract class AbstractWheel implements WheelInterface {

    private int size;  //refers to field
    private boolean wide;  //refers to field
    private Spokes spokes;
    private Bearings bearings;

    public AbstractWheel(int size, boolean width) {  //constructor; vars refer to parameters
        this.size = size;  //'this' means I'm talking about the class
        this.wide = width;      //and not the parameter
        spokes = new Spokes();
        bearings = new Bearings();
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
    public void acceptVisitor(WheelVisitorInterface visitor) {
        spokes.acceptVisitor(visitor);
        bearings.acceptVisitor(visitor);
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " at " + size + " inches";
        }

}
