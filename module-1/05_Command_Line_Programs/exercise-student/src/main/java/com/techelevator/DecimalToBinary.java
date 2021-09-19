package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String decimalValues = userInput.nextLine();
		String[] binaryValues = decimalValues.split(" ");

		for(int i = 0; i < binaryValues.length; i++) {
			int num = Integer.parseInt(binaryValues[i]);
			System.out.println(num + " in binary is ");

			decimaltoBinary(num);
			System.out.println(" ");

		}


	}

	public static void decimaltoBinary(int num) {
		int binary[] = new int[20];
		int a = 0;

		while (num > 0) {

			binary[a++] = num % 2;
			num = num / 2;
		}

		for(int i = a - 1; i >= 0; i--) {
			System.out.println(binary[i]);
		}
	}

}
