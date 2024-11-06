/*

Program: Lunch order      Date: November 5, 2024

Purpose: displays the lunch order price


School: CHHS
Course: Computer Science 20
 
*/
package Mastery;

import java.util.Scanner;

class Food {
    private double price;
    private int fat;
    private int carbs;
    private int fiber;

    public Food(double price, int fat, int carbs, int fiber) {
        this.price = price;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
    }

    public double getPrice() {
        return price;
    }

    public int getFat() {
        return fat;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getFiber() {
        return fiber;
    }
}

public class LunchOrder {
    public static void main(String[] args) {
        // Create Food objects with prices 
        Food hamburger = new Food(1.85, 9, 33, 1);
        Food salad = new Food(2.00, 1, 11, 5);
        Food frenchFries = new Food(1.30, 11, 36, 4);
        Food soda = new Food(0.95, 0, 38, 0);

        Scanner scanner = new Scanner(System.in);

        // Prompt user for quantities
        System.out.print("Enter the number of hamburgers: ");
        int numHamburgers = scanner.nextInt();
        
        System.out.print("Enter the number of salads: ");
        int numSalads = scanner.nextInt();
        
        System.out.print("Enter the number of french fries: ");
        int numFrenchFries = scanner.nextInt();
        
        System.out.print("Enter the number of sodas: ");
        int numSodas = scanner.nextInt();

        // Calculate total
        double total = (numHamburgers * hamburger.getPrice()) +
                       (numSalads * salad.getPrice()) +
                       (numFrenchFries * frenchFries.getPrice()) +
                       (numSodas * soda.getPrice());

        // Display total
        System.out.printf("Total cost of the order: $%.2f%n", total);
        
      
    }
}





/* screen dump
Enter the number of hamburgers: 2
Enter the number of salads: 34
Enter the number of french fries: 6
Enter the number of sodas: 3
Total cost of the order: $82.35
*/