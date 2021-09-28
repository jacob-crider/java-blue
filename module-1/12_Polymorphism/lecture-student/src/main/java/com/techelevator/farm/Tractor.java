package com.techelevator.farm;

public class Tractor implements Singable {

    public String getName() {
        return "Tractor";
    }

    public String getSound() {
        return "Rrrrrr";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Tractor)) {
            return false;
        }
        Tractor other = (Tractor) obj;
        if (other.getName().equals(this.getName()) && other.getSound().equals(this.getSound())) {
            return true;
        }
        return false;
    }
}

