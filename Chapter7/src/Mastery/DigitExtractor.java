/*

Program: Diget extreactor      Date: November 1, 2024

Purpose: This will display the numbers place value for the users input 


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner;

class Num {
    private int number;

    public Num(int number) {
        this.number = number;
    }

    public int getWhole() {
        return number;
    }

    public int getOnes() {
        return Math.abs(number) % 10;
    }

    public int getTens() {
        return (Math.abs(number) / 10) % 10;
    }

    public int getHundreds() {
        return (Math.abs(number) / 100) % 10;
    }
}

public class DigitExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer: ");
            int userInput;


            try {
                userInput = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                continue;
            }

            Num numObj = new Num(userInput);

            while (true) {
                System.out.println("\nInput W for whole number");
                System.out.println("Input O for ones place");
                System.out.println("Input T for tens");
                System.out.println("Input H for hundreds");
                System.out.println("Input Q to quit");
                System.out.print("Enter your choice: ");
                String choice = scanner.nextLine().trim().toUpperCase();

                switch (choice) {
                    case "W":
                        System.out.println("Whole number: " + numObj.getWhole());
                        break;
                    case "O":
                        System.out.println("Ones digit: " + numObj.getOnes());
                        break;
                    case "T":
                        System.out.println("Tens digit: " + numObj.getTens());
                        break;
                    case "H":
                        System.out.println("Hundreds digit: " + numObj.getHundreds());
                        break;
                    case "Q":
                        System.out.println("Exiting the program.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
        
  /* screen dump
Enter an integer: 324

Input W for whole number
Input O for ones place
Input T for tens
Input H for hundreds
Input Q to quit
Enter your choice: h
Hundreds digit: 3

Input W for whole number
Input O for ones place
Input T for tens
Input H for hundreds
Input Q to quit
Enter your choice: o
Ones digit: 4

Input W for whole number
Input O for ones place
Input T for tens
Input H for hundreds
Input Q to quit
Enter your choice: t
Tens digit: 2

Input W for whole number
Input O for ones place
Input T for tens
Input H for hundreds
Input Q to quit
Enter your choice: q
Exiting the application. 
*/