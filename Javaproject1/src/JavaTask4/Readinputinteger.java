package JavaTask4;

import java.util.Scanner;

public class Readinputinteger {

	public static void main(String[] args) {

		
       Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first integer (numerator)");
		int numerator = scanner.nextInt();

		System.out.print("Enter the second integer (denominator):");
		int denominator = scanner.nextInt();

		try {
		// Perform division
		int result = numerator / denominator;
		System.out.println("The result of division is: " + result);
		} catch (ArithmeticException e) {
		// Handle division by zero
		System.out.println("Error: Cannot divide by zero.");
		} finally {
		// Close the scanner
		scanner.close();
		
		}
	}

}
