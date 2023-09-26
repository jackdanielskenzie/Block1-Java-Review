package org.example;

public class Person {
    // Class Members includes properties and methods
    public String firstName;
    public String lastName;
    public String city;
    private int id;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(String firstName, String lastName, String city, int id, String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.id = id;
        this.state = state;
    }

    public Person() {
        this("John", "Doe");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String state;
}
