package com.techelevator.farm;
// abstract class can be extended, but itself cannot be instantiated
// abstract class can pass on functionality through inheritance like a superclass
// abstract class can force an override in a subclass like an interface
// abstract classes are still DataTypes
public abstract class FarmAnimal implements Singable, Sellable {
	private String name;
	private String sound;
	private int price;
	private boolean isSleeping = false;

	public FarmAnimal(String name, String sound, int price) {
		this.name = name;
		this.sound = sound;
		this.price = price;
	}

	// abstract method can only be added in an abstract class
	// abstract method forces a subclass of this class to Override with an implementation (like an interface does)
	// this means each instantiated FarmAnimal must have their own implementation of eat()
	public abstract String eat();

	public void sleep() {
		this.isSleeping = true;
	}

	public void wake() {
		this.isSleeping = false;
	}

	public String getName() {
		return name;
	}

	public final String getSound() { // final keyword means the value cannot be reassigned/overridden
		if (isSleeping) {
			return "Zzzz";
		}
		return sound;
	}

	public int getPrice() {
		return price;
	}

}