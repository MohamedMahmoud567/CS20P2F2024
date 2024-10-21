/*

Program: Prime Number         Date: October 15, 2024

Purpose: Create an application that promots the user for a number and display whether its prime or not

Author: Mohamed Mahmoud
School: CHHS
Course: Computer Programming 20
 

*/

package src.Mastery;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 

		int X;
		
		boolean isPrime=true;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter any number:");
		
		int num=scan.nextInt();
	        scan.close();
		
	     for(int i=2;i<=num/2;i++)
		{
	     
	    	 
	    	 X=num%i;
		   if(X==0)
		   {
		      isPrime=false;
		     
		      
		    
		   }
		}
		
		
	     if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   }
	
    }

/*
 
 Enter any number:
23
23 is a Prime Number
 
 screen dump test case 2
 
 
 Enter any number:
12
12 is not a Prime Number

 
 
 */

	
	

	


	
	
