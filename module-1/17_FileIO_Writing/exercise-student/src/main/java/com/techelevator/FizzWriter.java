package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	private static final int fizzNumber = 3;
	private static final int buzzNumber = 5;

	public static void main(String[] args) throws FileNotFoundException {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter the path name: ");
		String path = userInput.nextLine();

		File fizzBuzz = new File(path);
		String output = "";

		try (PrintWriter printWriter = new PrintWriter(fizzBuzz)) {
			for (int i = 1; i < 301; i++) {
				if (i % fizzNumber == 0 && i % buzzNumber == 0) {
					output = "FizzBuzz";
				} else if (i % fizzNumber == 0 || (Integer.toString(i).contains("3"))) {
					output = "Fizz";
				} else if (i % buzzNumber == 0 || (Integer.toString(i).contains("5"))) {
					output = "Buzz";
				} else {
					output = Integer.toString(i);
				}
				printWriter.println(output);
			}
		}
	}
}
