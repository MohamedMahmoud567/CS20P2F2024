/*

Program: EvensAndOdds      Date: November 14, 2024

Purpose: This will generate 25 random numbers between 0-90 and display all even and all odd


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Random;

public class EvensAndOdds {

    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();

       
        String evens = "";
        String odds = "";

        // Generate 25 random integers between 0 and 99
        for (int i = 0; i < 25; i++) {
            int number = random.nextInt(100);  // Generate random number between 0 and 99

            // Check if the number is even or odd
            if (number % 2 == 0) {
                evens += number + " "; 
            } else {
                odds += number + " "; 
            }
        }

        // Display the even numbers
        System.out.println("Even numbers: " + evens);

        // Display the odd numbers
        System.out.println("Odd numbers: " + odds);
    }
}




/* screen dump

Even numbers: 94 52 8 82 72 14 30 18 94 18 96 14 34 12 
Odd numbers: 33 93 3 79 23 3 81 79 75 71 9 

*/
