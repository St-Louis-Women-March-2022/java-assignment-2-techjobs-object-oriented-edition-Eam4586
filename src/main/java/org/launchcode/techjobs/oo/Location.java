package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {

    private int id;
    private static int nextId = 1;
    private static String value = "";

    public Location() {
        super(value);
        id = nextId;
        nextId++;
    }

    public Location (String value) {//location will only take a value "LaunchCode"
        this();//initializes id
        this.value = value;//the book says aValue
    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field. Don't understand.


    // Custom toString, equals, and hashCode methods:DONE

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        Employer.value = value;
    }
}
