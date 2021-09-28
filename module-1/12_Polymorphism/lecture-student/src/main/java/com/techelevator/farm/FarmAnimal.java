package com.techelevator.farm;

public class FarmAnimal implements Singable, Sellable { // implement Singable here to include Farm Animals in OldMacDonald
	private String name;
	private String sound;
	private int price;

	public FarmAnimal(String name, String sound, int price) {
		this.name = name;
		this.sound = sound;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public String getSound() {
		return sound;
	}

}