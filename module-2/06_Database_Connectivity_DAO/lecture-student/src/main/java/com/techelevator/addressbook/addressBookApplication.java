package com.techelevator.addressbook;

import com.techelevator.addressbook.dao.JdbcPersonDAO;
import com.techelevator.addressbook.dao.PersonDAO;
import com.techelevator.addressbook.model.Person;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;

public class addressBookApplication {

    public static void main(String[] args) {

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/dvdstore");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        PersonDAO personDAO = new JdbcPersonDAO(dataSource);

        List<Person> persons = personDAO.list();

        System.out.println(persons);
    }
}
