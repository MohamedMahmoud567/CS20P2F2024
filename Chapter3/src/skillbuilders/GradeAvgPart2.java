package skillbuilders;

import java.util.Scanner;

public class GradeAvgPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner input = new Scanner(System.in);
		   
		  System.out.print("Please enter the first grade: ");
		  int Num1 = input.nextInt();
		
		  System.out.print("Please enter the second grade: ");
		  int Num2 = input.nextInt();
		   
		  System.out.print("Please enter the third grade: ");
		  int Num3 = input.nextInt();
		   
		  System.out.print("Please enter the fourth grade: ");
		  int Num4 = input.nextInt();
		  
		  System.out.print("Please Enter the fifth grade: ");		  
		  int Num5 = input.nextInt();
		   
		  System.out.println("The average of all five numbers is: " + (Num1 + Num2 + Num3 + Num4 + Num5) );
		 }
		}


