package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer {//creates the Employer class

    private int id;//creates the id object, fluid placeholder for each employer because it's a field.  It will show up on each instance you create.
    private static int nextId = 1;//static belongs to employer class but will not show up for each instance because it is static.
    private String value;

    public Employer() {//accepts no argument
        id = nextId;//assigns the value of nextId to the id field
        nextId++;//adds one to Id
    }

    public Employer(String value) {//employer will only take a value "LaunchCode"
        this();//initializes id
        this.value = value;//the book says aValue
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }//This to string is set to return the value. System.out.println(job.getEmployer); returns value

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }//getter for Id

    public String getValue() {
        return value;
    }//getter for Value

    public void setValue(String value) {
        this.value = value;
    }//setter for Value

}
