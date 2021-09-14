package com.techelevator;

public class Lecture {

	public static void main(String[] args) {

		int costOfBookInDollars = 10;

		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		// Declaration defines the data type and name of the variable
		*/ int numberOfExercises = 26;
		System.out.println(numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		// Declaration and assignment can occur together
		*/ double half = 0.5;
		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/ String name = "Tech Elevator";
		System.out.println(name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/ int seasonsOfFirefly = 1;
		System.out.println(seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/ String myFavoriteLanguage = "Java";
		System.out.println(myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/ double pi = 3.1416;
		System.out.println(pi);

		/*
		7. Create and set a variable that holds your name.
		*/ String myName = "Jacob Crider";
		System.out.println(myName);

		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/ int numberOfButtonsOnMouse = 2;
		System.out.println(numberOfButtonsOnMouse);

		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/ double percentageOfBattery = .50;
		System.out.println(percentageOfBattery);

		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/ int difference = 121 - 27;
		System.out.println(difference);

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/ double sum = 12.3 + 32.1;
		System.out.println(sum);

		/*
		12. Create a String that holds your full name.
		*/ String fullName = "Jacob Crider";
		System.out.println(fullName);

		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/ String hello = "Hello, " + fullName;
		System.out.println(hello);

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/ fullName = fullName + " Esquire";
		System.out.println(fullName);

		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/ fullName += " Esquire";
		System.out.println(fullName);

		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/ String saw = "Saw" + 2;
		System.out.println(saw);

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/ saw += 0;
		System.out.println(saw);

		/*
		18. What is 4.4 divided by 2.2?
		*/
		System.out.println(4.4 / 2.2);

		/*
		19. What is 5.4 divided by 2?
		*/
		System.out.println(5.4 / 2);

		/*
		20. What is 5 divided by 2?
		*/
		System.out.println(5 / 2);

		int numberOfBooks = 7;
		int totalCostOfBooks = 3;
		int costPerBook = numberOfBooks / totalCostOfBooks;
		System.out.println(costPerBook);

		/*
		21. What is 5.0 divided by 2?
		*/
		System.out.println(5.0 / 2);

		double answer = 5 / 2;
		System.out.println(answer);

		answer = 5d / 2;
		System.out.println(answer);

		answer = (double) 5 / 2; // Explicit Casting
		System.out.println(answer);

		long bigNumber = 10;
		int smallNumber = (int) bigNumber;
		System.out.println(smallNumber);

		// If a value doesn't fit into the type it is truncated
		double doubleValue = 10.2576;
		int intValue = (int) doubleValue;
		System.out.println(intValue);


		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/

		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		System.out.println(5 % 2);

		/*
		24. What is 1,000,000,000 * 3?
		*/ int tooLargeOfNumber = 1000000000 * 3;
		System.out.println(tooLargeOfNumber);

		long tooLargeAsLong = 10000000L * 3;
		System.out.println(tooLargeAsLong);

		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/ boolean doneWithExercises = false;

		/*
		26. Now set doneWithExercise to true.
		*/ doneWithExercises = true;
		System.out.println(doneWithExercises);
		
	}

}
