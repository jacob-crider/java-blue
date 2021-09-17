package com.techelevator;

import java.util.Locale;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);


		System.out.println("Please enter the temperature: ");
		int temperatureCOrF = userInput.nextInt();
		userInput.nextLine();

		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?");
		String celsiusOrFahrenheitFromUser = userInput.nextLine();

		System.out.println(temperatureCOrF + celsiusOrFahrenheitFromUser + " is " + tempCalc(temperatureCOrF, celsiusOrFahrenheitFromUser) + (celsiusOrFahrenheitFromUser.toUpperCase().startsWith("F") ? "C." : "F."));

	}

	public static int tempCalc(int temperatureCOrF, String celsiusOrFahrenheit) {

		if (celsiusOrFahrenheit.toUpperCase().startsWith("F")) {
			int tempC = (int) ((temperatureCOrF - 32) / 1.8);
			return tempC;
		} else {
			int tempF = ((int) (temperatureCOrF * 1.8 + 32));
			return tempF;
		}
	}

}
