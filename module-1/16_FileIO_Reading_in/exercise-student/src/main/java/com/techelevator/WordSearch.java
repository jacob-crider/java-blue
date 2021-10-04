package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("What is the full qualified name of the file that should be searched? ");
		String fileName = userInput.nextLine();
		File file = new File(fileName);

		System.out.println("What is the search word you are looking for?");
		String searchWord = userInput.nextLine();

		System.out.println("Should the search be case sensitive? (Y/N");
		String caseSensitive = userInput.nextLine();

		try(Scanner fileScanner = new Scanner(file)) {
			int lineCount = 0;
			while (fileScanner.hasNextLine()) {
				lineCount++;
				String lineContents = fileScanner.nextLine();
				if (caseSensitive.equals("N")) {
					if (lineContents.toLowerCase().contains(searchWord.toLowerCase())) {
						System.out.println(lineCount + ") " + lineContents);
					}
				} else if (caseSensitive.equals("Y")) {
					if (lineContents.contains(searchWord)) {
						System.out.println(lineCount + ") " + lineContents);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

}
