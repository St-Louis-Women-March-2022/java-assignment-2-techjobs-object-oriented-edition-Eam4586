package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job extends JobField {

    private int id;//used to identify job objects
    public static int nextId = 1;
    public String name;
    public Employer employer;//This is a class with a value and id field.
    public Location location;//This is a class with a value and id field.
    public PositionType positionType;//This is a class with a value and id field.
    public CoreCompetency coreCompetency;//This is a class with a value and id field.
    public static String value = "";

    public Job() {//One constructor (method called Job that takes in an id) to initialize a unique ID
        super(value);
        id = nextId;//assigns the value of nextId to the id field
        nextId++;//adds one to Id
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();//it calls the no argument constructor above to set the id.
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
        return String.valueOf(location);
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

    @Override
    public String toString() {
        String notAvailable = "Data not available";
        if (name == "") {
            name += notAvailable;
        }

        if (String.valueOf(employer) == ""){
            employer.setValue(notAvailable);
            }

        if (String.valueOf(location) == ""){
            location.setValue(notAvailable);
        }

        if (String.valueOf(positionType) == ""){
            positionType.setValue (notAvailable);
            }

        if (String.valueOf(coreCompetency) == "") {
            coreCompetency.setValue (notAvailable);
            }

        return '\n' +
                "ID: " + id + '\n' +
                "Name: " + name + '\n' +
                "Employer: " + employer + '\n' +
                "Location: " + location + '\n' +
                "Position Type: " + positionType + '\n' +
                "Core Competency: " + coreCompetency + '\n';
            //If a field is empty, method should add, “Data not available” after the label.  Manipulate my variables
            // before they go into the return.  Make the return just a variable. Declare it at the top.
        }

        // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
        //  match. DONE

        // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
        //  and id. DONE
    }

