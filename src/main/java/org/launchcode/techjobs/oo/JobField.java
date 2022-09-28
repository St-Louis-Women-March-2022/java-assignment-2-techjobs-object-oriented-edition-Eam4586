package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    public int id;//creates the id object, fluid placeholder for each employer because it's a field.  It will show up on each instance you create.
    public static int nextId = 1;//static belongs to employer class but will not show up for each instance because it is static.
    public String value;

    public JobField () {//One constructor (method called Job that takes in an id) to initialize a unique ID
        id = nextId;//assigns the value of nextId to the id field
        nextId++;//adds one to Id
    }

    public JobField(String value) {
        this();//calls the id constructor to create an id
        this.value = value;//creates a value
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id && value.equals(jobField.value);
    }

    @Override
        public int hashCode() {
        return Objects.hash(id, value);
    }
    @Override
        public String toString() {
            return value;
        }
    }
