package com.designpatterns.visitor;

public class Spokes implements VisitableInterface {
    @Override
    public void acceptVisitor(WheelVisitorInterface visitor) {
        visitor.visit(this);
    } // the end of the method
} // the end of the class
