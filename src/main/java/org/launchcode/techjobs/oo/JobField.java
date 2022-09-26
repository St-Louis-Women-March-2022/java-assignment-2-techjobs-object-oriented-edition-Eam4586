package org.launchcode.techjobs.oo;

public abstract class JobField {

    public int id;//creates the id object, fluid placeholder for each employer because it's a field.  It will show up on each instance you create.
    public static int nextId = 1;//static belongs to employer class but will not show up for each instance because it is static.
    public String value;

    public JobField(String value) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        JobField.nextId = nextId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
