package org.example;

public class SapphirePhone extends Phone implements PhoneInterface {
    public void makeACall(int phoneNumber) {
        System.out.println("Ring ring!" + phoneNumber);
    }
    public void touchMenu() {
        System.out.println("You touched the screen!");
    }
    public void connectWireless() {
        System.out.println("Connection successful!");
    }

    /*
    Extension (Class extends ParentClass) -
    Inherit from regular classes
    May get a mix of variables and methods
    A class "inherits" from its parent class
     */

    /* Implementation
    Doesn't get any code
    Doesn't get any variables
    MUST write an implementation for each abstract method
    A class "implements" its parent class
     */
}
