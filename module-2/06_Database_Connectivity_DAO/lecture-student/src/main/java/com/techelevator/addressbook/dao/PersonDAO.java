package com.techelevator.addressbook.dao;

import com.techelevator.addressbook.model.Person;

import java.util.List;

public interface PersonDAO {

    List<Person> list();
    void create(Person personToAdd);


}
