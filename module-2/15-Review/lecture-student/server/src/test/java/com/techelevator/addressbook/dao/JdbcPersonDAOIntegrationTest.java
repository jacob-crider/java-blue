package com.techelevator.addressbook.dao;

import com.techelevator.addressbook.dao.model.Person;
import com.techelevator.addressbook.dao.model.dao.JdbcPersonDAO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDate;

public class JdbcPersonDAOIntegrationTest extends DAOIntegrationTest {

    private JdbcTemplate jdbcTemplate;
    private JdbcPersonDAO jdbcPersonDAO;

    @Before
    public void setup() {
        jdbcTemplate = new JdbcTemplate(getDataSource());
        jdbcPersonDAO = new JdbcPersonDAO(jdbcTemplate);
    }

    @Test
    public void get_all_persons() {
        Person person = new Person();
        person.setFirstName("testFirst");
        person.setLastName("testLast");
        person.setDateAdded(LocalDate.now());
    }
}
