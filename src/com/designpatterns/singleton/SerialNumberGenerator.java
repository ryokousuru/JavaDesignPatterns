package com.designpatterns.singleton;

public class SerialNumberGenerator {
    private static SerialNumberGenerator instance;
    private int count = 910414;

    public synchronized static SerialNumberGenerator getInstance() {
        if(instance == null) {
            instance = new SerialNumberGenerator();
        }
        return instance;
    } // the end of the if statement
    private SerialNumberGenerator() { }

    public synchronized int getNextSerial() {return ++count; }
} // the end of the class
