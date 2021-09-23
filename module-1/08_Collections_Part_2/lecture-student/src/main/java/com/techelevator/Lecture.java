package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {


		System.out.println();		
		System.out.println("####################");
		System.out.println("       SETS");
		System.out.println("####################");
		System.out.println();

		/* DECLARE AND INSTANTIATE A SET */

<<<<<<< HEAD
		// HashSet is the most commonly used.
		// Set<Integer> setOfNumbers = new HashSet<Integer>();

		// LinkedHashset maintains the order of insertion
		// Set<Integer> setOfNumbers = new LinkedHashSet<Integer>();

		// TreeSet does not allow null and maintains the natural order fo the data type
		Set<Integer> setOfNumbers = new TreeSet<Integer>();
		/* ADD ITEMS TO THE SET */
		setOfNumbers.add(1);
		setOfNumbers.add(10);
		setOfNumbers.add(30);
		setOfNumbers.add(301);
		/* duplicates are ignored */
		setOfNumbers.add(301);
		setOfNumbers.add(301);
		setOfNumbers.add(42);
		setOfNumbers.add(5708);
=======
		// HashSet is the most commonly used.  It does not maintain order.
		Set<Integer> setOfNumbers = new HashSet<Integer>();

		// LinkedHashSet maintains the order of insertion
		//Set<Integer> setOfNumbers = new LinkedHashSet<Integer>();
>>>>>>> d347934b7c453d7f3fb009384a4dd299f6d4b13c

		// TreeSet does not allow null and maintains the natural order of the data type
		//Set<Integer> setOfNumbers = new TreeSet<Integer>();

		/* ADD ITEMS TO THE SET */
		setOfNumbers.add(1);
		setOfNumbers.add(10);
		setOfNumbers.add(30);
		setOfNumbers.add(301);
		/* duplicates are ignored */
		setOfNumbers.add(301);
		setOfNumbers.add(301);
		setOfNumbers.add(42);
		setOfNumbers.add(5708);
		
		/* LOOP OVER A SET */
		for (Integer number : setOfNumbers) {
			System.out.println(number);
		}

		for (Integer number : setOfNumbers) {
			System.out.println(number);
		}

		
		/*USE CASE:  USE A SET TO REMOVE DUPLICATES AND ORDER THE ARRAY */
		String[] instructorWorkLog = {"Rachelle", "John", "Matt", "Kevin", "Rachelle", "Steve", "John", "Rachelle" };

		Set<String> worklogSet = new TreeSet<String>();

		// Add it to the set to remove duplicates
		for (String instructors : instructorWorkLog) {
			worklogSet.add(instructors);
		}

<<<<<<< HEAD
		// here to print out results
		for (String instructor : worklogSet) {
			System.out.println(instructor);
		}
		
=======
		// just here to print out the results
		for (String instructor: worklogSet) {
			System.out.println(instructor);
		}
>>>>>>> d347934b7c453d7f3fb009384a4dd299f6d4b13c

		
		
		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();
		
		/* DECLARING AND INSTANTIATING A MAP */
		Map<String, String> animalNoises = new HashMap<String, String>();
		
		/* ADDING ITEMS TO A MAP */
		animalNoises.put("Cow", "Moo");
		animalNoises.put("Chicken", "Cluck");
		animalNoises.put("Dog", "Bark");
		animalNoises.put("Cat", "Meow");
		animalNoises.put("Lion", "Roar");
		animalNoises.put("Duck", "Roar");
		
		/* UPDATING AN ITEM IN A MAP */
<<<<<<< HEAD
=======
		// if put with an existing key then the existing value is replaced with the new value
>>>>>>> d347934b7c453d7f3fb009384a4dd299f6d4b13c
		animalNoises.put("Duck", "Quack");

		/* RETRIEVING AN ITEM FROM A MAP */
		String chickenSound = animalNoises.get("Chicken");
		System.out.println(chickenSound);
<<<<<<< HEAD
=======

		// If the key does not exist in the map, then get() returns null
		String foxSound = animalNoises.get("fox");

>>>>>>> d347934b7c453d7f3fb009384a4dd299f6d4b13c

		/* REMOVING AN ITEM FROM A MAP */
		String lionNoise = animalNoises.remove("Lion");

<<<<<<< HEAD
		
		// If the key does not exists, the null returned
		String foxSound = animalNoises.get("fox");
=======
		// If the key does not exists, the null returned
		String removeFoxReturn = animalNoises.remove("fox");
>>>>>>> d347934b7c453d7f3fb009384a4dd299f6d4b13c
		
		
		/* CHECK IF AN ITEM EXISTS */
		// containsKey(key) returns TRUE if the KEY exists in the Map
		boolean catExists = animalNoises.containsKey("Cat");
<<<<<<< HEAD
		boolean	cowExistsAsKey = animalNoises.containsKey("Moo");

		// containsValue(value) returns TRUE if the VALUE exists in the Map
		boolean roarExists = animalNoises.containsValue("Roar");
=======
		boolean mooExistsAsKey = animalNoises.containsKey("Moo");

		// containsValue(value) returns TRUE if the VALUE exists in the Map
		boolean mooExists = animalNoises.containsValue("Moo");
>>>>>>> d347934b7c453d7f3fb009384a4dd299f6d4b13c
		boolean catExistsAsValue = animalNoises.containsValue("Cat");

		System.out.println();
		
		/* LOOPING OVER A MAP */
		// Loop through a map by looping through the Keys (using keySet())
		// Then using the keys to get the value

<<<<<<< HEAD
		for (String animalName /* temporary values that holds key during the loop */ : animalNoises.keySet()) /* keys for animal noises as a set */ {
			// For each key can use it to get the value
			String animalNoise = animalNoises.get(animalName); /* gets the value associated with that key */
			System.out.println("The " + animalName + " says " + animalName);
		}

		// Loop through the map using the EntrySet
		for (Map.Entry<String, String> mapEntry : animalNoises.entrySet()) {
			System.out.println("The " + mapEntry.getKey() + " says " + mapEntry.getValue()); /* getKey and getValue as added onto the temporary variable */
		}

=======
		for (String animalName : animalNoises.keySet()) {
			// For each key can use it to get the value
			String animalNoise = animalNoises.get(animalName);
			System.out.println("The " + animalName + " says " + animalNoise);
		}

		// Loop through the map using the EntrySet
		for(Map.Entry<String, String> mapEntry : animalNoises.entrySet()) {
			System.out.println("The " + mapEntry.getKey() + " says " + mapEntry.getValue());
		}
>>>>>>> d347934b7c453d7f3fb009384a4dd299f6d4b13c

		System.out.println();
		
		/* THE MAP KEY AND VALUE DATA TYPES */
		// Key and Value do not need to be the same type, but both must be Reference Types
		Map<Integer, Double> accounts = new HashMap<Integer, Double>();
		accounts.put(12345, 100d);
		accounts.put(56789, 200d);
		
		// Transfer half of Map 12345's money to account 56789
		double halfOfAccount12345 = accounts.get(12345) / 2.0;
		accounts.put(12345, accounts.get(12345) - halfOfAccount12345);
		accounts.put(56789, accounts.get(56789) + halfOfAccount12345);
<<<<<<< HEAD
		
=======


>>>>>>> d347934b7c453d7f3fb009384a4dd299f6d4b13c

		
		
		System.out.println();
		System.out.println("####################");
		System.out.println("      MAP ORDER     ");
		System.out.println("####################");
		System.out.println();
	
		/*
		 * The Order that a Map stores the keys is dependent on the Implementation class used.
		 * 
		 * HashMap - does not retain order
		 * LinkedHashMap - retains the order of insertion
		 * TreeMap - maintains Natural Order for the Data Type of the key
		 */
		
		System.out.println("The values where inserted in the following order: 2, 10, 25, 1");
		
		System.out.println();
		System.out.println("  HASHMAP");
		System.out.println("Does not retain any order.  Instead it uses it's own internal ordering");
		
		Map<Integer, String> hashMapNumbersToWords = new HashMap<Integer, String>();
		
		hashMapNumbersToWords.put(2,  "Two");
		hashMapNumbersToWords.put(10, "Ten");
		hashMapNumbersToWords.put(25, "Twenty-Five");
		hashMapNumbersToWords.put(1,  "One");
		
		for (Integer number : hashMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + hashMapNumbersToWords.get(number) /* returns the value associated with the key */);
		}		
		
		
		System.out.println();
		System.out.println("  LINKED HASHMAP");
		System.out.println("Retains the Order of Insertion");

		Map<Integer, String> linkedHashMapNumbersToWords = new LinkedHashMap<Integer, String>();
		
		linkedHashMapNumbersToWords.put(2,  "Two");
		linkedHashMapNumbersToWords.put(10, "Ten");
		linkedHashMapNumbersToWords.put(25, "Twenty-Five");
		linkedHashMapNumbersToWords.put(1,  "One");
		
		for (Integer number : linkedHashMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + linkedHashMapNumbersToWords.get(number));
		}	
		
		
		System.out.println();
		System.out.println("  TREEMAP");
		System.out.println("Maintains the Natural Order of the Data Type");
		System.out.println();
		System.out.println("Natural Order when numbers are Integer");
		
		Map<Integer, String> treeMapNumbersToWords = new TreeMap<Integer, String>();
		
		treeMapNumbersToWords.put(2,  "Two");
		treeMapNumbersToWords.put(10, "Ten");
		treeMapNumbersToWords.put(25, "Twenty-Five");
		treeMapNumbersToWords.put(1,  "One");
		
		for (Integer number : treeMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + treeMapNumbersToWords.get(number));
		}	


		System.out.println();
		System.out.println("TreeMap Natural Order when numbers are String");

		Map<String, String> treeMapNumbersAsStrings = new TreeMap<String, String>();
		
		treeMapNumbersAsStrings.put("2",  "Two");
		treeMapNumbersAsStrings.put("10", "Ten");
		treeMapNumbersAsStrings.put("25", "Twenty-Five");
		treeMapNumbersAsStrings.put("1",  "One");
		
		for (String number : treeMapNumbersAsStrings.keySet()) {
			System.out.println(number + " is " + treeMapNumbersAsStrings.get(number));
		}	

	}

}
