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
	Double A =  Userinput.nextDouble();
	
	 
	System.out.println("Please enter a value for b: ");
	Double B =  Userinput.nextDouble();
	
	System.out.println("Please enter a value for c: ");
    Double C =  Userinput.nextDouble();
	
	
	Double Root1;
	Double Root2;
	
	Double seperating = B * B - 4 * A * C;
	if(seperating <0) {
		System.out.println ("The roots you have entered are not real numbers");
	}
	
	if (seperating == 0) {
		System.out.println("The roots are equal");
		Root1 = -B / (2*A);
		Root2 = Root1;
		
	}
	else {
		System.out.println("Roots are real numbers");
		Root1 = (-B + Math.sqrt(seperating)) /(2*A);
		Root2 = (-B - Math.sqrt(seperating)) /(2*A);
	}
	
	System.out.println("Here is the roots");
	System.out.println("Root1: " + Root1);
	System.out.println("Root2 : " + Root2);

	
	
	
	

	}

}



/*
 Screen dump 
 
 test case 1
 Please enter a value for a: 
3
Please enter a value for b: 
6
Please enter a value for c: 
2
Roots are real numbers
Here is the roots
Root1: -0.42264973081037427
Root2 : -1.5773502691896255



test case 2

Please enter a value for a: 
5
Please enter a value for b: 
4
Please enter a value for c: 
6
The roots you have entered are not real numbers
Roots are real numbers
Here is the roots
Root1: NaN
Root2 : NaN

 */