package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
=======
import javax.print.DocFlavor;
>>>>>>> f2fca31e9f4306c052308966af3ca3ccb9096fb8
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
public class HotelController {

    private HotelDAO hotelDAO;
    private ReservationDAO reservationDAO;

    public HotelController() {
        this.hotelDAO = new MemoryHotelDAO();
        this.reservationDAO = new MemoryReservationDAO(hotelDAO);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
<<<<<<< HEAD
    // RequestMapping (endpoint_path, web_method)
    @RequestMapping(path="/hotels", method=RequestMethod.GET)
    public List<Hotel> list(@RequestParam(required = false, defaultValue = "") String state, @RequestParam(required = false) String city) { // RequestParam(required = false) means parameter can be optional and is in the query string in Postman
       List <Hotel> filteredHotels = new ArrayList<>();     // defaultValue is called when a State is not requested
       List<Hotel> hotels = hotelDAO.list();
       if (city == null && state.length() == 0) {
           return hotels;
       }

       for (Hotel hotel : hotels) {
           // if the city was passed, we will ignore state
           if (city != null) {
               if (hotel.getAddress().getCity().equalsIgnoreCase(city)) {
                   filteredHotels.add(hotel);
               }
           } else {
             // if city is null we know the state must have a value otherwise it would have returned earlier, so check if hotel is in that state
                if (hotel.getAddress().getState().equalsIgnoreCase(state)) {
                    filteredHotels.add(hotel);
                }
           }
       }
       return filteredHotels;
=======
    // @RequestMapping( endpoint_path, web_method )
    @RequestMapping(path="/hotels", method=RequestMethod.GET)
    public List<Hotel> list(@RequestParam(required=false, defaultValue="") String state,
                            @RequestParam(required=false) String city) {

        List<Hotel> filteredHotels = new ArrayList<Hotel>();
        List<Hotel> hotels = hotelDAO.list();

        if (city == null && state.length() == 0) {
            return hotels;
        }

        for (Hotel hotel : hotels) {
            // if the city was passed, we will ignore state
            if (city != null) {
                if (hotel.getAddress().getCity().equalsIgnoreCase(city)) {
                    filteredHotels.add(hotel);
                }
            } else {
                // If city is null we know the state must have a value otherwise it would have
                // returned earlier, so check if the hotel is in that state
                if (hotel.getAddress().getState().equalsIgnoreCase(state)) {
                    filteredHotels.add(hotel);
                }
            }
        }

        return filteredHotels;
>>>>>>> f2fca31e9f4306c052308966af3ca3ccb9096fb8
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path="/hotels/{id}", method=RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        Hotel hotel = hotelDAO.get(id);
        return hotel;
    }

    @RequestMapping(path="/reservations", method=RequestMethod.GET)
    public List<Reservation> listReservations() {
        List<Reservation> listOfReservations = reservationDAO.findAll();
        return listOfReservations;
    }

    @RequestMapping(path="/reservations/{id}", method=RequestMethod.GET)
    public Reservation getReservation(@PathVariable int id) {
        return reservationDAO.get(id);
    }
<<<<<<< HEAD

    @RequestMapping(path="/hotels/{id}/reservations", method=RequestMethod.GET)
    public List<Reservation> listReservationsByHotel(@PathVariable("id") int hotelId) {
        return reservationDAO.findByHotel(hotelId);
    }

    @RequestMapping(path="/hotels/{id}/reservations", method=RequestMethod.POST)
    public Reservation addReservation(@RequestBody Reservation reservation, @PathVariable("id") int hotelId) {
        return reservationDAO.create(reservation, hotelId);
    }

=======
>>>>>>> f2fca31e9f4306c052308966af3ca3ccb9096fb8

    @RequestMapping(path="/hotels/{id}/reservations", method=RequestMethod.GET)
    public List<Reservation> listReservationsByHotel(@PathVariable("id") int hotelId) {
        return reservationDAO.findByHotel(hotelId);
    }

    @RequestMapping(path="/hotels/{id}/reservations", method=RequestMethod.POST)
    public Reservation addReservation(@RequestBody Reservation reservation,
                                      @PathVariable("id") int hotelId) {
        return reservationDAO.create(reservation, hotelId);
    }
}
