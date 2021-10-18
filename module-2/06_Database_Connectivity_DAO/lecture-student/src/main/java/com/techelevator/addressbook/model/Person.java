package com.techelevator.addressbook.model;

import java.time.LocalDate;

public class Person {

    private long personId;
    private String firstName;
    private String lastName;
    private LocalDate dateAdded;

    public long getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                '}';
    }
}
