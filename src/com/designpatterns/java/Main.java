package com.designpatterns.java;
import adapter.UltraWheel;
import adapter.UltraWheelAdapter;
import com.designpatterns.abstractfactory.*;
import com.designpatterns.base.*;
import com.designpatterns.builder.BikeBuilder;
import com.designpatterns.builder.BikeDirector;
import com.designpatterns.builder.RoadBikeBuilder;
import com.designpatterns.builder.RoadBikeDirector;
import com.designpatterns.decorator.CustomGripOption;
import com.designpatterns.decorator.GoldFrameOption;
import com.designpatterns.facade.BikeFacade;
import com.designpatterns.singleton.SerialNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        facadeExample();
        //decoratorExample();
        //adapterExample();
        //singletonExample();
        //builderExample();
        //abstractFactoryExample();
	// write your code here
    } //the end of the Main method

    private static void facadeExample() {
        BikeFacade facade = new BikeFacade();
        facade.prepareForSale(new DownHill(new WideWheel(24)));
    }

    private static void decoratorExample() {
        BikeInterface myTourBike = new Touring(new NarrowWheel(24));
        System.out.println(myTourBike);

        myTourBike = new CustomGripOption(myTourBike);
        System.out.println(myTourBike);

        myTourBike = new GoldFrameOption(myTourBike);
        System.out.println(myTourBike);
    }

    private static void adapterExample() {
        UltraWheel ultraWheel = new UltraWheel(28);
        List<WheelInterface> wheels = new ArrayList<>();
        wheels.add(new NarrowWheel(24));
        wheels.add(new NarrowWheel(20));
        wheels.add(new WideWheel(24));
        wheels.add(new UltraWheelAdapter(ultraWheel));
        wheels.add(new UltraWheelAdapter(new UltraWheel(26)));

        for(WheelInterface wheel : wheels) {
            System.out.println(wheel);
        }
    } // the end of the method

    private static void singletonExample() {
        System.out.println("Generating the Serial Numbers");
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        System.out.println("next serial = " + generator.getNextSerial());
        System.out.println("next serial = " + generator.getNextSerial());
        System.out.println("next serial = " + generator.getNextSerial());
        System.out.println("next serial = " + generator.getNextSerial());
    } // the end of the method

    private static void builderExample() {
        RoadBike bike = new Touring(new NarrowWheel(22));
        BikeBuilder builder = new RoadBikeBuilder(bike);
        BikeDirector director = new RoadBikeDirector();
        BikeInterface bikeInterface = director.build(builder);
        System.out.println(bikeInterface);
    } // the end of the method

    private static void abstractFactoryExample() {
        AbstractBikeFactory factory = new RoadBikeFactory();
        BikeFrameInterface frame = factory.createFrame();
        BikeSeatInterface seat = factory.createSeat();

        System.out.println(frame.getFrameParts());
        System.out.println(seat.getSeatParts());
    } //the end of the method
} //the end of the class