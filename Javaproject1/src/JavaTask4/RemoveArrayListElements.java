package JavaTask4;

import java.util.ArrayList;

public class RemoveArrayListElements {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Print the ArrayList before removing elements
        System.out.println("ArrayList before removing elements: " + fruits);

        // Remove all elements from the ArrayList
        fruits.clear();

        // Print the ArrayList after removing elements
        System.out.println("ArrayList after removing elements: " + fruits);
    }
}
