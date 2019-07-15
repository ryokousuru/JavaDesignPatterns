package com.designpatterns.visitor;

public class Bearings implements VisitableInterface {

    @Override
    public void acceptVisitor(WheelVisitorInterface visitor) {
        visitor.visit(this);
    }
}
