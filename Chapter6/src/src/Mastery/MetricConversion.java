/*

Program: MetricConvertion       Date: October 23, 2024

Purpose: A program to help you with metric convertion.


School: CHHS
Course: Computer Science 20
 
*/



package src.Mastery;

import java.util.Scanner;

public class MetricConversion {

    public static void main(String[] args) {
       
    	
    	
    	
     Scanner scanner = new Scanner(System.in);
        int choice;

         {
        
            System.out.println("1. Inches to Centimeters");
            System.out.println("2. Feet to Centimeters");
            System.out.println("3. Yards to Meters");
            System.out.println("4. Miles to Kilometers");
            System.out.println("5. Kilometers to Miles");
            System.out.print("Enter your choice (1-5): ");         
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Please enter inches: ");
                    double inches = scanner.nextDouble();
                    double centimeters = inchesToCentimeters(inches);
                    System.out.printf("%.2f inches is %.2f centimeters.%n", inches, centimeters);
                    break;
                case 2:
                    System.out.print("Please enter feet: ");
                    double feet = scanner.nextDouble();
                    centimeters = feetToCentimeters(feet);
                    System.out.printf("%.2f feet is %.2f centimeters.%n", feet, centimeters);
                    break;
                case 3:
                    System.out.print("Please enter yards: ");
                    double yards = scanner.nextDouble();
                    double meters = yardsToMeters(yards);
                    System.out.printf("%.2f yards is %.2f meters.%n", yards, meters);
                    break;
                case 4:
                    System.out.print("Please enter miles: ");
                    double miles = scanner.nextDouble();
                    double kilometers = milesToKilometers(miles);
                    System.out.printf("%.2f miles is %.2f kilometers.%n", miles, kilometers);
                    break;
                case 5:
                    System.out.print("Please enter kilometers: ");
                    kilometers = scanner.nextDouble();
                    miles = kilometersToMiles(kilometers);
                    System.out.printf("%.2f kilometers is %.2f miles.%n", kilometers, miles);
                    break;
             
                default:
                    System.out.println("That is not a choice. Please try again.");
            }
            System.out.println();
        } while (choice != 6);

      
    }

   
    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double feetToCentimeters(double feet) {
        return feet * 30.48;
    }

    public static double yardsToMeters(double yards) {
        return yards * 0.9144;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}




/* screen dump
1. Inches to Centimeters
2. Feet to Centimeters
3. Yards to Meters
4. Miles to Kilometers
5. Kilometers to Miles
Enter your choice (1-5): 3
Enter yards: 45
45.00 yards is 41.15 meters.



Screen dump test case 2
1. Inches to Centimeters
2. Feet to Centimeters
3. Yards to Meters
4. Miles to Kilometers
5. Kilometers to Miles
Enter your choice (1-5): 78
Invalid choice. Please try again.

*/