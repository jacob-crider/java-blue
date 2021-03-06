package com.techelevator.addressbook.dao;

import com.techelevator.addressbook.model.Address;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcAddressDAO implements AddressDAO {

    private JdbcTemplate jdbcTemplate;

    public JdbcAddressDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Address> getByPersonId(long contactId) {
        String sql = "SELECT address.address_id, address, address_line_two, postal_code, city, district, " +
                "country, type, type_description " +
                "FROM address " +
                "JOIN contact_address ON address.address_id = contact_address.address_id " +
                "WHERE contact_address.contact_id = ?";

        List<Address> addresses = new ArrayList<Address>();

        SqlRowSet rows = jdbcTemplate.queryForRowSet(sql, contactId);
        while(rows.next()) {
            addresses.add( mapRowToAddress(rows));
        }
        return addresses;
    }

    @Override
    public void add(Address address, long personId) {
        String sql = "INSERT INTO address (address_id, address, address_line_two, postal_code, city, " +
                "district, country, type, type_description) " +
                "VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING address_id";
        long addressId = jdbcTemplate.queryForObject(sql, Long.class, address.getLineOne(),
                address.getLineTwo(), address.getPostalCode(), address.getCity(), address.getDistrict(),
                address.getCountryCode(), address.getType(), address.getTypeDescription());
        address.setAddressId(addressId);
        insertAddressContact(addressId, personId);
    }

    @Override
    public void update(Address address) {
        String sql = "UPDATE address SET " +
                "address = ?, address_line_two = ?, postal_code = ?, city = ?, district = ?, " +
                "country = ?, type = ?, type_description = ? WHERE address_id = ?";
        jdbcTemplate.update(sql, address.getLineOne(), address.getLineTwo(), address.getPostalCode(),
                address.getCity(), address.getDistrict(), address.getCountryCode(),
                address.getType(), address.getTypeDescription(), address.getAddressId());
    }

    @Override
    public void delete(long addressId) {
        deleteAddressContact(addressId);
        String sql = "DELETE FROM address WHERE address_id = ?";
        jdbcTemplate.update(sql, addressId);
    }

    private void deleteAddressContact(long addressId) {
        String sql = "DELETE FROM contact_address WHERE address_id = ?";
        jdbcTemplate.update(sql, addressId);
    }

    private void insertAddressContact(long addressId, long personId) {
        String sql = "INSERT INTO contact_address (person_id, address_id) VALUES (?,?)";
        jdbcTemplate.update(sql, personId, addressId);
    }

    private Address mapRowToAddress(SqlRowSet row) {
        Address address = new Address();

        address.setAddressId( row.getLong("address_id"));
        address.setLineOne( row.getString("address"));
        address.setLineTwo( row.getString("address_line_two"));
        address.setPostalCode( row.getString("postal_code"));
        address.setCity( row.getString("city"));
        address.setDistrict( row.getString("district"));
        address.setCountryCode( row.getString("country"));
        address.setType(row.getString("type"));
        address.setTypeDescription(row.getString("type_description"));
        return address;
    }
}
