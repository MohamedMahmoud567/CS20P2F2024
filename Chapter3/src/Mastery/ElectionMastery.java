/*

Program: Election_Mastery.java          Date: September 25, 2024

Purpose: Displays the elction votes.


School: CHHS
Course: Computer Science 20
 
*/




package Mastery;

import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.BeepAction;

public class ElectionMastery {

	private static final char[] The = null;

	public static void main(String[] args) 
	{
		
		  //Create new scanner
    Scanner Userinput = new Scanner(System.in);
    
   System.out.println("Please enter election numbers for Awbrey in NewYork: "); 
   int newyork1 = Userinput.nextInt();
   
   System.out.println("Please enter election numbers for Martinez in NewYork: "); 
   int newyork2 = Userinput.nextInt();
   
   System.out.println("Please enter election numbers for  Awbrey in NewJersey : "); 
   int newjersey1 = Userinput.nextInt();
  
   System.out.println("Please enter election numbers for Martinez in NewJersey: "); 
   int newjersey2 = Userinput.nextInt();
   
   System.out.println("Please enter election numbers for Awbrey in Connecticut: "); 
   int connecticut1 = Userinput.nextInt();
  
   System.out.println("Please enter election numbers for Martinez in Connecticut: "); 
   int connecticut2 = Userinput.nextInt();
   
   
   
   System.out.println("The number for all the votes for Awbrey is: " + (newyork1 + newjersey1 + connecticut1 ));
   System.out.println("The number for all the votes for Martinez is: " + (newyork2 + newjersey2 + connecticut2 ));
	
   System.out.println("The number for all the votes in all is: " + (newyork1 + newyork2 + newjersey1 + newjersey2 + connecticut1 + connecticut2  ));
	

	}

	}
	
	
	/* Screen Dump


	Please enter election numbers for Awbrey in NewYork: 
3123
Please enter election numbers for Martinez in NewYork: 
12
Please enter election numbers for  Awbrey in NewJersey : 
312
Please enter election numbers for Martinez in NewJersey: 
313
Please enter election numbers for Awbrey in Connecticut: 
123
Please enter election numbers for Martinez in Connecticut: 
12312
The number for all the votes for Awbrey is: 3558
The number for all the votes for Martinez is: 12637
The number for all the votes in all is: 16195



	 
	 */



