package com.designpatterns.builder;

import com.designpatterns.base.BikeInterface;

public class RoadBikeDirector extends BikeDirector { //start of the class
    @Override
    public BikeInterface build(BikeBuilder builder) { //start of the method
        builder.buildHandleBars();
        builder.buildStreetTires();
        return builder.getBike();
    } // the end of the method
} // the end of the class
