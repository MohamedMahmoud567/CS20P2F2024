/*

Program: Savings      Date: October 31, 2024

Purpose: Like a bank asks you to add coins or take out coins


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Savings {

    static class PiggyBank {
        private Map<String, Integer> coins = new HashMap<>() {{
            put("pennies", 0);
            put("nickels", 0);
            put("dimes", 0);
            put("quarters", 0);
        }};

        public void addCoins(String coinType, int amount) {
            if (coins.containsKey(coinType)) {
                coins.put(coinType, coins.get(coinType) + amount);
            } else {
                System.out.println("Invalid coin type.");
            }
        }

        public void removeCoins(String coinType, int amount) {
            if (coins.containsKey(coinType)) {
                if (coins.get(coinType) >= amount) {
                    coins.put(coinType, coins.get(coinType) - amount);
                } else {
                    System.out.println("Not enough coins to remove.");
                }
            } else {
                System.out.println("Invalid coin type.");
            }
        }

        public double totalAmount() {
            return coins.get("pennies") * 0.01 +
                   coins.get("nickels") * 0.05 +
                   coins.get("dimes") * 0.10 +
                   coins.get("quarters") * 0.25;
        }
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1: Show total in bank");
        System.out.println("2: Add a penny");
        System.out.println("3: Add a nickel");
        System.out.println("4: Add a dime");
        System.out.println("5: Add a quarter");
        System.out.println("6: Take money out of the bank");
        System.out.println("Enter 0 to quit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        PiggyBank piggyBank = new PiggyBank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Total amount in the bank: $%.2f%n", piggyBank.totalAmount());
                    break;

                case 2:
                    piggyBank.addCoins("pennies", 1);
                    System.out.println("Added a penny.");
                    break;

                case 3:
                    piggyBank.addCoins("nickels", 1);
                    System.out.println("Added a nickel.");
                    break;

                case 4:
                    piggyBank.addCoins("dimes", 1);
                    System.out.println("Added a dime.");
                    break;

                case 5:
                    piggyBank.addCoins("quarters", 1);
                    System.out.println("Added a quarter.");
                    break;

                case 6:
                    System.out.print("Enter coin type to remove (pennies, nickels, dimes, quarters): ");
                    String coinTypeRemove = scanner.next().toLowerCase();
                    System.out.print("Enter amount to remove: ");
                    int amountRemove = scanner.nextInt();
                    piggyBank.removeCoins(coinTypeRemove, amountRemove);
                    break;

                case 0:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


/* screen dump
Menu:
1: Show total in bank
2: Add a penny
3: Add a nickel
4: Add a dime
5: Add a quarter
6: Take money out of the bank
Enter 0 to quit
Enter your choice: 2
Added a penny.

Menu:
1: Show total in bank
2: Add a penny
3: Add a nickel
4: Add a dime
5: Add a quarter
6: Take money out of the bank
Enter 0 to quit
Enter your choice: 1
Total amount in the bank: $0.01

Menu:
1: Show total in bank
2: Add a penny
3: Add a nickel
4: Add a dime
5: Add a quarter
6: Take money out of the bank
Enter 0 to quit
Enter your choice: 0
Exiting the application.
 */