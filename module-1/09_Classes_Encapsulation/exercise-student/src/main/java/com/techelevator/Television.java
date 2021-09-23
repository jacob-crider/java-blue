package com.techelevator;

public class Television {

// Instance Variables *STEP 1*
    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    // Methods *STEP 3*
    public void turnOff() {
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
        this.currentChannel = 3;
        this.currentVolume = 2;
    }

    public void changeChannel(int newChannel) {
        if ((this.isOn == true && (newChannel >= 3) && newChannel <= 18)) {
            this.currentChannel = newChannel;
        }
    }

    public void channelUp() {
        if (this.isOn == true && currentChannel <= 18) {
            currentChannel++;
        }
        if (this.isOn == true && currentChannel > 18) {
            this.currentChannel = 3;
        }
    }

    public void channelDown() {
        if (this.isOn == true && currentChannel >= 3) {
            currentChannel--;
        }
        if (this.isOn == true && currentChannel < 3) {
            this.currentChannel = 18;
        }
    }

    public void raiseVolume() {
        if (isOn && currentVolume < 10) {
            currentVolume++;
        }

    }

    public void lowerVolume() {
        if (isOn && currentVolume > 0) {
            currentVolume--;
        }
    }

    // Getters *STEP 2*
    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
