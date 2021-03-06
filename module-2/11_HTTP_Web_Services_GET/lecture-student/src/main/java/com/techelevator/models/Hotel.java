package com.techelevator.models;

public class Hotel {

    private int id;
    private String name;
    private int stars;
    private int roomsAvailable;
    private String coverImage;
    private int costPerNight;
    private HotelAddress address;

    public Hotel() {

    }

    public HotelAddress getAddress() {
        return address;
    }

    public void setAddress(HotelAddress address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public int getRoomsAvailable() {
        return roomsAvailable;
    }

    public String getCoverImage() {
        return coverImage;
    }

    @Override
    public String toString() {
        return "\n--------------------------------------------" +
                "\n Hotel Details" +
                "\n--------------------------------------------" +
                "\n Id: " + id +
                "\n Name:'" + name + '\'' +
                "\n Stars: " + stars +
                "\n RoomsAvailable: " + roomsAvailable +
                "\n overImage" + coverImage;
    }
}
