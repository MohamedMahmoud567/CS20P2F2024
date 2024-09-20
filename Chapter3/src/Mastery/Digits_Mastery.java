/*

Program: Digits_Mastery.java          Date: September 17, 2008

Purpose: Displays the hundred-place, tens-place, and ones-place digits for a three-digit number.


School: CHHS
Course: Computer Science 20
 
*/


package Mastery;

import java.util.Scanner;

public class Digits_Mastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  //Create new scanner
        Scanner input = new Scanner(System.in);

        //Values of each digit
        int hundreds = 0;
        int tens = 0;
        int ones = 0;

        //Prompt user to input 3 digit number           
        System.out.print("Please enter a 3 digit number: ");
        int number = input.nextInt();

if (number <= 999 && number > 99)   // Checking condition for three digit number
{

        //Displays hundreds place digit
        hundreds = number / 100;
        System.out.printf("Hundreds place digit: " + hundreds);

        //Displays tens digit
        tens = (number - (hundreds*100)) / 10;  // compare with your code
        System.out.printf("\nTens place digit: " + tens);


        //Display ones digit
        ones = (number - (tens*10) - (hundreds*100));   // compare with your code
        System.out.printf("\nOnes place digit: " + ones);   
}
                         //Error if number is less or more then three digits
else                                                                    
{      
if (number > 999)
        System.out.println("Sorry number is more then 3 digits.");
        if (number < 100)
        System.out.println("Sorry number less then 3 digits.");
}



}
}




/* Screen Dump


Test Case 1:  Please enter a 3 digit number: 23
Sorry number less then 3 digits.





Test Case 2: Please enter a 3 digit number: 547
Hundreds place digit: 5
Tens place digit: 4
Ones place digit: 7
 


 
 */



