package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {

		Singable[] singers = new Singable[] { new Cow(), new Chicken(), new Sheep(), new Tractor(), new MusicBox() }; // use interface as the data type at the beginning of this line

		for (Singable singer : singers) {
			String name = singer.getName();
			String sound = singer.getSound();

			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		List<Sellable> itemsForSale = new ArrayList<Sellable>(); // allows us to keep Tractor out of Items for sale below while keeping it in the song
		itemsForSale.add(new Cow());
		itemsForSale.add(new Chicken());
		itemsForSale.add(new Sheep());
		itemsForSale.add(new Egg());
		itemsForSale.add(new MusicBox());

		System.out.println();
		System.out.println("Items for sale: ");
		for (Sellable item : itemsForSale) {
			System.out.println(item.getName() + " $" + item.getPrice());
		}

		/*
			Casting
			This is called Upcasting because we are casting UP the hierarchy from specific to general
		 */

			//Chicken has access to everything:
				//getName()
				//getSound()
				//getPrice()
				//layEgg()
		/*
		// Chicken chicken = new Chicken();

		/*
			When cast to FarmAnimal, chicken can only access:
				getName()
				getSound()
				getPrice()
		 */
		// FarmAnimal chickenAsFarmAnimal = chicken;

		/*
			When chicken cast to Sellable, chicken can only access:
				getName()
				gerPrice()
		/*
		// Sellable chickenAsSellable = chicken;

		 */
			//When chicken cast to Singable, chicken can only access:
				//getName()
				//getSound()
		// Singable chickenAsSingable = chicken;

		/*
		Casting
			When narrowing or going to the more specific, must be explicit
			This is called Downcasting (we are casting DOWN to the more specific category)
		 */
		Singable chickenSinger = new Chicken();

		Singable tractorSinger = new Tractor();

		/*
			Can cast the chicken into a Sellable
		 */

		Sellable chickenSellable = (Sellable) chickenSinger;

		/*
			Casting the tractor to Sellable will result in a ClassCastException at runtime,
			because Tractor does not implement the Sellable interface
		 */
		//Sellable tractorSellable = (Sellable) tractorSinger;

		/*
			Can also cast the chicken Singer into a FarmAnimal or a Chicken
		*/
		FarmAnimal chickenFarmAnimal = (FarmAnimal) chickenSinger;
		Chicken backToChicken = (Chicken) chickenSinger;

		Tractor one = new Tractor();
		Tractor two = one;
		one.equals(two);

	}
}