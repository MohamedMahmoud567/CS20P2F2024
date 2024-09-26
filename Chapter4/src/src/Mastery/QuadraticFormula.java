/*

Program: Quadratic Formula.java          Date: September 26, 2024

Purpose: quadratic formula equation.


School: CHHS
Course: Computer Science 20
 
*/



package src.Mastery;

import java.util.Scanner;

public class QuadraticFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner Userinput = new Scanner(System.in);	
	
	
	
	
	
	System.out.println("Please enter a value for a: ");
	int a =  Userinput.nextInt();
	
	 
	System.out.println("Please enter a value for b: ");
	int b =  Userinput.nextInt();
	
	System.out.println("Please enter a value for c: ");
	int c =  Userinput.nextInt();
	
	int answer1 ;
	answer1 = (int) Math.sqrt((b*b)-4*a*c);
	answer1 = -b + answer1;
	answer1 = answer1/(2*a);
	
	System.out.print("X = " + answer1);
	
	}

}



/*
 Screen dump 
 
 
 
 
 Please enter a value for a: 
2
Please enter a value for b: 
6
Please enter a value for c: 
9
X = -1

 
 
 */



