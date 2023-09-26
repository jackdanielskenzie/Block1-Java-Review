package org.example;

import java.util.Objects;

public class Penny extends Coin {
    public String metal;
    int year;


    public Penny(String metal, int year) {
        this.metal = metal;
        this.year = year;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

// Overriding .equals
//    We write a special boolean equals(Object obj) to override the default method
//    We write a special int hashCode() to override the default method (more on this below)

//    @Override
//    public int hashCode() {
//        return Objects.hash(metal, year);
//    }

//    @Override
//    public boolean equals(Object other) {
//        // Logic to return true or fals
//        //1. Check the address to see if its the same
//        if (this == other) {
//            return true;
//        }
//        //2. Check if the other class is the same type
//        if (other == null || !(other instanceof Penny)) {
//            return false;
//        }
//        //3. Cast the other class to the same type // Type-Casting
//        Penny that = (Penny) other;
//
//        //4. Check if both classes have the same value
//        return (Object.equals(this.year, that.metal) &&
//                this.year == that.year);
//    }


}
