package skillbuilders;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner userInput = new Scanner(System.in);
     
     
     System.out.print("Enter the MIN value: ");
     int MIN =  userInput.nextInt();
    
     System.out.print("Enter the MAX value: ");
     int MAX =  userInput.nextInt();
    
             if (MIN > MAX) {
             System.out.println("Error: min must be smaller then ");
             return;
    
      }
          Random random = new Random();
      int X = random.nextInt((MAX - MIN) + 1) + MIN;
    
      System.out.println("Random number between " + MIN + " and " + MAX + ": " + X); }
	
    
    
 }





