package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> instructors = new ArrayList<String>();

		instructors.add("John");
		instructors.add("Steve");
		instructors.add("Matt");
		instructors.add("Kevin");
		instructors.add("Andrew");


		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for(int i = 0; i < instructors.size(); i++) {
			System.out.println(instructors.get(i)); // pulls the value at the index (i)
		}


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		instructors.add("John");


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		instructors.add(3, "Rachelle");


		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		instructors.remove(4);


		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		boolean isSteveInList = instructors.contains("Steve");
		boolean isKevinInList = instructors.contains("Kevin");


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfAndrew = instructors.indexOf("Andrew");


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] instructorsArray = instructors.toArray(new String[instructors.size()]);

		// Arrays can be turned into lists too
		String[] letters = {"a", "b", "c", "d"};
		List<String> lettersList = Arrays.asList(letters);



		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(instructors);


		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(instructors);

		// Creating an Integer List
		// To use primitive data types, the Wrapper class must be used
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10);

		Integer employees = new Integer(25);
		Integer piecesOfCake = new Integer("24");

		if (employees > piecesOfCake) {
			System.out.println("Not enough cake.");
		}

		Integer objX = 10;
		int intY = 20;
		intY = objX + 5;
		objX = intY + 10;


		/* Double accountBalance = null;
		accountBalance = accountBalance + 100; */



		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for (String name : instructors) {
			System.out.println(name);
		}

		double[] doubles = {2.5, 3.567, 0.75, 783.12};

		for (double currentItem : doubles){
			double dblValue = currentItem * 2;
			System.out.println(dblValue);
		}

		// QUEUE
		Queue<String> tasks = new LinkedList<String>();

		// The offer() method adds to the queue
		tasks.offer("Clean dishes");
		tasks.offer("Sweep floor");
		tasks.offer("Clean counters");
		tasks.offer("Scrub ceiling");

		// While loops until queue is empty/runs out
		while (!tasks.isEmpty()) {
			// To retrieve an item from the queue, use poll() method
			System.out.println("Working on task " + tasks.poll());
		}

		// STACK
		Stack<Integer> numberHistory = new Stack<Integer>();
		// The push() method adds things to a Stack
		numberHistory.push(10);
		numberHistory.push(20);
		numberHistory.push(30);

		while (!numberHistory.isEmpty()) {
			// Retrieve items with pop()
			System.out.println(numberHistory.pop());
		}

	}
}
