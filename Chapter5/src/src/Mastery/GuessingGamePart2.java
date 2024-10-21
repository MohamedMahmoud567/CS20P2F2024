/*

Program: Guessing game part2       Date: October 16, 2024

Purpose: A guessing word game.


School: CHHS
Course: Computer Science 20
 
*/

package src.Mastery;

import java.util.Scanner;

public class GuessingGamePart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				
	    
int guess  ; 
int secretnumber = 19;
	
		Scanner input = new Scanner(System.in);
		
		
		
			System.out.println("Please guess the number, hint it is between 1-30 :  ");
						
			guess = input.nextInt();
			
				
				  while (guess != 0)
				  {
			           
			            if (guess == secretnumber) 
			            {
			                System.out.println("You got the number correct!");
			            } else {
			                System.out.println("You've guessed it incorrectly. Please try again.");
			            }
						
					
		
			            System.out.println("Please guess the number, hint it is between 1-30 :  ");
						
						guess = input.nextInt();
						
			           
			        }
				  System.out.println("Game Over!");
			  
			    }
			}



/* screen dump
  Please guess the number, hint it is between 1-30 :  
4
You've guessed it incorrectly. Please try again.
Please guess the number, hint it is between 1-30 :  
6
You've guessed it incorrectly. Please try again.
Please guess the number, hint it is between 1-30 :  
9
You've guessed it incorrectly. Please try again.
Please guess the number, hint it is between 1-30 :  
0
Game Over!


Screen dump test case 2

Please guess the number, hint it is between 1-30 :  
19
You got the number correct!

 */