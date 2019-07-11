package com.designpatterns.facade;

import com.designpatterns.base.BikeInterface;

public class BikeFacade {
    public  void prepareForSale(BikeInterface bike){
        Registration reg = new Registration(bike);
        reg.allocatingBikeNumber();
        Documentation.printBrochure();
        bike.airTires();
        bike.cleanFrame();
        bike.testRide();
    }
}
