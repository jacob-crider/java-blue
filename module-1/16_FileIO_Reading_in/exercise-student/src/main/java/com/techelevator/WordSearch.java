package com.techelevator;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("What is the full qualified name of the file that should be searched? ");
		String fileName = in.nextLine();
		File file = new File(fileName);

		System.out.println("What is the search word you are looking for?");
		String searchWord = in.nextLine();
		in.nextLine();

		try(Scanner fileScanner = new Scanner(file)) {

			while(fileScanner.hasNextLine()) {
				
			}
		}
	}

}
