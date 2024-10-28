/*

Program: Add coins      Date: October 28, 2024

Purpose: A program to add all coins inputed by the user


School: CHHS
Course: Computer Science 20
 
*/
package src.Mastery;

import java.util.Scanner;

public class AddCoins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of pennies: ");
        int pennies = scanner.nextInt();

        System.out.print("Enter the number of nickels: ");
        int nickels = scanner.nextInt();
        
        System.out.print("Enter the number of dimes: ");
        int dimes = scanner.nextInt();
        
        System.out.print("Enter the number of quarters: ");
        int quarters = scanner.nextInt();

        System.out.println("Total amount: " + getDollarAmount(pennies, nickels, dimes, quarters));

      
    }

    public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters) {
        double total = pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25;
        return String.format("$%.2f", total);
    }
}





/* screen dump
Enter the number of pennies: 23
Enter the number of nickels: 46
Enter the number of dimes: 768
Enter the number of quarters: 23
Total amount: $85.08
*/