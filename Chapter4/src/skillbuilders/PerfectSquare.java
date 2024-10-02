package skillbuilders;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, squared;
		double squareRoot;
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Prompt the user
		System.out.println("Enter an integer: ");
		
		//Record user input
		num = input.nextInt();
		
		//Take the square root of the number entered by the user
		squareRoot = Math.sqrt(num);
		
		//Take in the integer portion of the original number
		squared = (int)Math.pow((int)squareRoot, 2);
		
		//Check to see if the two numbers are equal
		if(num == squared)
		{
			System.out.println("The number is a perfect square");
		}
		else
		{
			System.out.println("The number is NOT a perfect square");
		}

	}

}


