/*

Program: Palindrome     Date: November 15, 2024

Purpose: This program will tell if the word or phrase is a palindrome

School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word or phrase
        System.out.print("Enter a word or phrase, and this program will identify if it's a palindrome: ");
        String input = scanner.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

       
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String string) {
      
        string = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

     
        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
         
            if (string.charAt(left) != string.charAt(right)) {
                return false;  // Not a palindrome if characters don't match
            }
            left++;
            right--;
        }

        return true;  // The string is a palindrome
    }
}



/* screen dump

Test case1 
Enter a word or phrase, and this program will identify if it's a palindrome: billy
The string is not a palindrome.


Test case2
Enter a word or phrase, and this program will identify if it's a palindrome: hannah
The string is a palindrome.

*/

