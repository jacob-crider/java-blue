package com.techelevator.calculator;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc = new Calculator(0);
		ScientificCalculator sciCalc = new ScientificCalculator(0);
		TrignometricCalculator trigCalc = new TrignometricCalculator();

		Calculator trigAsRegularCalc = trigCalc;

		// Causes a ClassCastException because calc is NOT already a Trignometric Calc
		// TrignometricCalculator regularCalcAsTrig = (TrignometricCalculator) calc;
		TrignometricCalculator regularCalcAsTrig = (TrignometricCalculator) trigAsRegularCalc;


		
	}
	

}
