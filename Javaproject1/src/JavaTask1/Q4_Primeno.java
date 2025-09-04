package JavaTask1;

import java.util.Scanner;

public class Q4_Primeno {

	

		public static boolean isPrime(int number) {
	        // Numbers less than 2 are not prime
	        if (number <= 1) 
	        {
	            return false;
	        }

	        // Only check up to the square root of the number
	        for (int i = 2; i <= Math.sqrt(number); i++) 
	        {
	            if (number % i == 0) 
	            {
	                return false;  
	            }
	        }
	        return true;  // The number is prime
	    }

	    public static void main(String[] args) {
	        // Scanner for input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        // Check if the number is prime
	        if (isPrime(number)) 
	        {
	            System.out.println(number + " is a prime number.");
	        } 
	        else
	        {
	            System.out.println(number + " is not a prime number.");
	        }

	 
	
	        scanner.close();
	    }

	}
		
	


