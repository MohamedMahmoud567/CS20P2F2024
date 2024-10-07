/*

Program: Guessing game           Date: September 26, 2024

Purpose: A guessing word game.


School: CHHS
Course: Computer Science 20
 
*/

package src.Mastery;

import java.util.Scanner;

public class GuessingGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String guess;
		
		Scanner input = new Scanner(System.in);
		
		String secretWord = "19";
		
		System.out.println("Please guess the number, hint it is between 1-30 :  ");
		
				guess = input.next();
				
				
				if(guess.equalsIgnoreCase(secretWord))
				{
					System.out.println("You got the number correct");
				}
				else
				{
					System.out.println("You've guessed it incorrectly");
				}
				
	}
}

/*
Screen dump test case 1

Please guess the number, hint it is between 1-30 :  
19
You got the number correct





Test case 2



Please guess the number, hint it is between 1-30 :  
11
You've guessed it incorrectly


 
*/
