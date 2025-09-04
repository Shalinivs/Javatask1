package JavaTask4;

import javax.imageio.IIOException;

public class AgeValidate {


		
		public static void checkAge(int age) throws Exception {
			if (age < 18) {
			throw new Exception("Age must be 18 or older.");
			} else {
			System.out.println("Age is valid.");
			}
			}

			public static void main(String[] args) throws Exception {

			java.util.Scanner scanner = new java.util.Scanner(System.in);


			System.out.print("Enter your age: ");
			int age = scanner.nextInt();


			try {

			checkAge(age);
			} catch (IIOException e) {

			System.out.println("Error: " + e.getMessage());
			}


			scanner.close();
			}

			
	}


