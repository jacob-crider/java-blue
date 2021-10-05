package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

//    Ask for quiz location
		System.out.println("Enter the fully qualified name of the file to read in for quiz questions: ");
		File testFile = new File(userInput.nextLine());
		// make a list of <QuizQuestion>
		List<QuizQuestion> fullQuiz = new ArrayList<QuizQuestion>();

//    scan from the test quiz file
		try (Scanner fileScanner = new Scanner(testFile)) {
			// store each as a QuizQuestion Object
			// nextline(); delimited by "|"
			while (fileScanner.hasNextLine()) {
				String currentQuestion = fileScanner.nextLine();
				// how do we create separate substrings delimited by "|" and store them properly.
				String[] currentQuestionAsArray = currentQuestion.split("|");
				String currentQuestionAnswer = "";
				for (int i = 1; i < currentQuestionAsArray.length; i++) {
					if (currentQuestionAsArray[i].contains("*")) {
						// remove * from correct answer so we can use it later
						currentQuestionAnswer = currentQuestionAsArray[i].replace("*", "");
						currentQuestionAsArray[i] = currentQuestionAnswer;
					}
				}
				QuizQuestion currentQuizQuestion = new QuizQuestion(currentQuestionAsArray, currentQuestionAnswer);
				fullQuiz.add(currentQuizQuestion);
				// first one is the question
				// each answer is assigned answerOne, answerTwo, answerThree, answerFour
				// contains "*" is assigned to the correctAnswer variable
				// remaining three are assigned random answer things
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found at path: " + testFile.getAbsolutePath());
		}

		// display the quizQuestions onto the console
		// do we want to ask one question at a time?


		// get userInput of what they think is correct answer

		// verify
		// compare correctAnswer to userInput
		// record correct answers
	}
}
