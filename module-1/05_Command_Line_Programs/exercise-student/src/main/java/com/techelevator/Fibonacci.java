package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int startingNum = 0;
		int addNum = 1;
		int keepNum = 0;

		Scanner userInput = new Scanner(System.in);


		System.out.print("Please enter a number: ");
		int numberFromUser = userInput.nextInt();
		userInput.nextLine();

		System.out.println(0 + " ");


		for (int nextNum = 0; nextNum <= numberFromUser; ++nextNum) {
			System.out.println(nextNum + " ");
			if (numberFromUser <= 0) {
				System.out.println("0, 1");
			} else if (numberFromUser == 1) {
				System.out.println("0, 1, 1");
			} else {
				keepNum = startingNum;
				startingNum = nextNum;
				nextNum = nextNum + keepNum;
			}

		}

	}
}


