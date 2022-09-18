package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {//contains my fields

    private int id;//used to identify job objects
    private static int nextId = 1;

    public String name;
    public Employer employer;//This is a class with a value and id field.
    public Location location;//This is a class with a value and id field.
    public PositionType positionType;//This is a class with a value and id field.
    public CoreCompetency coreCompetency;//This is a class with a value and id field.

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {//One constructor (method called Job that takes in an id) to initialize a unique ID
        id = nextId;//assigns the value of nextId to the id field
        nextId++;//adds one to Id
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();//it calls the no argument constructor on line 20 to set the id.
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return String.valueOf(employer);
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getLocation() {
        return String.valueOf (location);
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPositionType() {
        return String.valueOf(positionType);
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public String getCoreCompetency() {
        return String.valueOf(coreCompetency);
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {//Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match. DONE

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id. DONE
}
