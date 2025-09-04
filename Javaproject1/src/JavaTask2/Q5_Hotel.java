package JavaTask2;

import java.util.Scanner;

public class Q5_Hotel {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of month");
         int months=sc.nextInt();
         
         System.out.print("Enter the room rent per month: ");
         double rentPerMonth = sc.nextDouble();

        System.out.println("Enter the number of days");
        int days=sc.nextInt();

        double totalCost = 0.0;

        
        for (int i = 1; i <= months; i++) {
            System.out.print("Enter the month number (1 for January, 2 for February, ..., 12 for December) for month " + i + ": ");
            int month = sc.nextInt();

       
            switch (month) {
                case 4: 
                case 5: 
                case 6: 
                case 11: 
                case 12: 
                    totalCost += rentPerMonth * 1.2; 
                    break;
                default:
                    totalCost += rentPerMonth; 
                    break;
            }
        }

       
        double dailyRent = rentPerMonth / 30; 
        totalCost += (days * dailyRent);

       
        System.out.printf("Total cost for the stay: %.2f\n", totalCost);

        sc.close(); 
    }

        
        

	}


