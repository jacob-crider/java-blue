package com.techelevator.addressbook.dao;

import com.techelevator.addressbook.model.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcPersonDAO implements PersonDAO {

    private JdbcTemplate jdbcTemplate;

    public JdbcPersonDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Person> list() {
        String sql = "SELECT person_id, first_name, last_name, date_added FROM person";
        List<Person> persons = new ArrayList<Person>();

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while(results.next()) {
            persons.add(mapRowToPerson(results));
        }

        return null;
    }

    @Override
    public void create(Person personToAdd) {

    }

    private Person mapRowToPerson(SqlRowSet row) {
        Person person = new Person();

        person.setPersonId(row.getLong("person_id"));
        person.setFirstName(row.getString("first_name"));
        person.setLastName(row.getString("last_name"));

        if (row.getDate("date_added") != null) {
            person.setDateAdded(row.getDate("date_added").toLocalDate());
        }
        return person;
    }

    @Override

}
