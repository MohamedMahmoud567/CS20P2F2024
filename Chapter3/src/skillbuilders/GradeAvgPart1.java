package skillbuilders;

import java.util.Scanner;

public class GradeAvgPart1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner input = new Scanner(System.in);
		   
		  System.out.print("Please enter the first number: ");
		  int Num1 = input.nextInt();
		
		  System.out.print("Please enter the second number: ");
		  int Num2 = input.nextInt();
		   
		  System.out.print("Please enter the third number: ");
		  int Num3 = input.nextInt();
		   
		  System.out.print("Please enter the fourth number: ");
		  int Num4 = input.nextInt();
		  
		  System.out.print("Please Enter the fifth number: ");		  
		  int Num5 = input.nextInt();
		   
		  
		  
		  System.out.println("The average grade is: %" + (Num1 + Num2 + Num3 + Num4 + Num5 / 5));
	}
}