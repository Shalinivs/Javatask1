package JavaTask2;

import java.util.Scanner;

public class Q2_Reservestring {

	public static void main(String[] args) {
		
		reverse();
	}

				
		static void reverse()
		{
			Scanner sc=new Scanner(System.in);// is created to read user input from the console.
			
			System.out.println("Enter the string");
			
			String s1=sc.next();
			
			String rev=" ";
			
			for(int i=s1.length()-1; i>=0; i--)
			{
				rev=rev+s1.charAt(i);
			}
		 System.out.println(rev);
		}
		
		
		
	
		
	}


