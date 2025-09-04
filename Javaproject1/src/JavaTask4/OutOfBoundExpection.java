package JavaTask4;

public class OutOfBoundExpection {

	public static void main(String[] args) {
      
		try {
			int[] numbers = {1, 2, 3, 4, 5};
			System.out.println("Accessing element at index 10: " + numbers[10]);
			} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index is out of bounds!");
			e.printStackTrace();
			}

			try {
			String text = "Hello";
			System.out.println("Accessing character at index 10: " + text.charAt(10));
			} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error: String index is out of bounds!");
			e.printStackTrace();
			}
		
	}

}
