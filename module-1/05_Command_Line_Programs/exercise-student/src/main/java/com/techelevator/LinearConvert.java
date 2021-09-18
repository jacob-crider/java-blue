package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter the length: ");
		int lengthFromUser = userInput.nextInt();
		userInput.nextLine();

		System.out.println("Is the measurement in (m)eters or (f)eet");
		String metersOrFeet = userInput.nextLine();

		System.out.println(lengthFromUser + metersOrFeet + " is " + lengthCalc(lengthFromUser, metersOrFeet) + (metersOrFeet.startsWith("m") ? "f." : "m."));


	}

	public static int lengthCalc(int lengthFromUser, String metersOrFeet) {

		double feetToMeters = 3.2808399;
		double metersToFeet = 0.3048;

		if (metersOrFeet.startsWith("m")) {
			int lengthFeet = (int) (lengthFromUser * feetToMeters);
			return lengthFeet;
		} else {
			int lengthMeters = (int) (lengthFromUser * metersToFeet);
			return lengthMeters;
		}
	}

}
