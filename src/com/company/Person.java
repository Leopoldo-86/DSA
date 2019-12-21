package com.company;

import java.util.Date;

public class Person {

    private String FirstName;
    private String LastName;
    private Date date;
    private String PassportNumber;
    private String PriorityLevel;
    private int ID;

    //CONSTRUCTOR -> Parameterised constructor with five parameters
    /**
     * @param FirstName
     * @param LastName
     */
    Person(String FirstName, String LastName, String PriorityLevel){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.date = date;
        this.PassportNumber = PassportNumber;
        this.PriorityLevel = PriorityLevel;
    }

    public String getFirstName() {

        return FirstName;
    }

    public void setFirstName(String firstName) {

        FirstName = firstName;
    }

    public String getLastName() {

        return LastName;
    }

    public void setLastName(String lastName) {

        LastName = lastName;
    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {
        this.date = date;

    }

    public String getPassportNumber() {

        return PassportNumber;
    }

    public void setPassportNumber(String passportNumber)
    {
        PassportNumber = passportNumber;
    }

    public String getPriorityLevel() {

        return PriorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {

        PriorityLevel = priorityLevel;
    }

    public int getID() {

        return ID;
    }

    public void setID(int ID) {

        this.ID = ID;
    }
}

