package com.techelevator;

public class QuizQuestion {

    private String[] quizQuestions = new String[5];
    private String correctAnswer;

    public QuizQuestion(String[] quizQuestions, String correctAnswer) {
        this.quizQuestions = quizQuestions;
        this.correctAnswer = correctAnswer;
    }

    public String[] getQuizQuestions() {
        return quizQuestions;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
