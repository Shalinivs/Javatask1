package JavaTask4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {

	public static void main(String[] args) {

		String fileName = "non_existent_file.txt";
		
		try {

			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line = bufferedReader.readLine();
			while (line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
			}

			bufferedReader.close();

			} catch (FileNotFoundException e) {

			System.out.println("Error: File not found! Please check the file path.");
			} catch (IOException e) {

			System.out.println("Error: An error occurred while reading the file.");
			}
		
	}

}
