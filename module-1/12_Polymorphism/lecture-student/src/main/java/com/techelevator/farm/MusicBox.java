package com.techelevator.farm;

public class MusicBox implements Singable, Sellable{
    public String getName() {
        return "Music Box";
    }

    public String getSound() {
        return "lalalala";
    }

    public int getPrice() {
        return 17;
    }
}
