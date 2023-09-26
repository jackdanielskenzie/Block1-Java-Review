package org.example;

public class Truck extends Vehicle implements Moveable{
    boolean canCarryStuff = true;
    String driverName = "";

    public Truck(boolean canCarryStuff, String driverName) {
        this.canCarryStuff = canCarryStuff;
        this.driverName = driverName;
    }
}
