package com.techelevator;

import java.util.Locale;

public class Lecture {

	public static void main(String[] args) {

		/*
			1) Declare a variable of the data type defined by the class
			2) Use the new keyword with the class name to instantiate the class into an Object,
				which we assign to the variable
			3) Initialize the Object with its starting state, which is the () after the class name
		 */
		// 1) Declare a variable	2) instantiate new Object using NEW keyword 3) initialize Object w/ starting state and assign ( = ) it to the variable
		LegoPerson legoPersonOne = new LegoPerson(); // Declare variable, "new" keyword = instantiate, data type = LegoPerson();
		LegoPerson legoPersonTwo = new LegoPerson("builder", "red", true);
		LegoPerson legoPersonThree = new LegoPerson("astronaut", "blue", false);

		// Change individual characteristics of each object created above

		legoPersonTwo.setClotingColor("yellow");
		legoPersonThree.setOccupation("nurse");

		int one = 100;
		int two = one;
		one = 200;

		int[] numbersOne = {10, 20, 30, 40};
		int[] numbersTwo = numbersOne;
		numbersOne[1] = 55;

		// Strings are immutable and new string must be created in order to alter the string.
		String str = "abc";
		String upperCaseStr = str.toUpperCase();

		String s = null;

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */



		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		// Object Equality

		String hello1 = "hello";
		String hello2 = new String("hello");

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory (IN THE STACK). Are they the same object? */
		if (hello1 == hello2) { // This statement is not true as hello1 and hello2 point to different values/strings in the heap
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;

		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}


		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		// name now points to the original String (name) now in LowerCase

		String name = "Tech Elevator";
		name = name.toLowerCase();

		// Strings are just char arrays
		char singleCharacter = 'T';
		char[] charArray = {'T', 'e', 'c', 'h', ' ', 'E', 'l', 'e', 'v', 'a', 't', 'o', 'r'};

		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		// substring( inclusive starting index, exclusive ending index);
		String subString = name.substring(8, 12);

		// Splitting an array on spaces
		String[] splitOnSpace = name.split(" ");

		// Swap to upper case and then split on all E's in the string
		String[] splitIgnoreCase = name.toUpperCase().split("E");


		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		// Assigns values of string to the char a
		char a = 'a';
		String b = String.valueOf(a);

		// Joins all values of countDown together with "-->" in between each element
		String countDown = String.join(" --> ", "Five", "Four", "Three", "Two", "One");
		System.out.println(countDown);


	}
}
