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

        int hundreds;
        int tens;
        int ones;
         
        System.out.print("Please enter a 3 digit number: ");
        int number = input.nextInt();

        hundreds = number / 100;
        System.out.print(" Hundreds place digit: " + hundreds );

        tens = (number - (hundreds*100)) / 10;  
        System.out.print(" Tens place digit: " + tens );
    
        ones = (number - (tens*10) - (hundreds*100));   
        System.out.print(" Ones place digit: " + ones );   

}



}

/* Screen Dump


Test case: Please enter a 3 digit number: 547
Hundreds place digit: 5
Tens place digit: 4
Ones place digit: 7
 


 
 */