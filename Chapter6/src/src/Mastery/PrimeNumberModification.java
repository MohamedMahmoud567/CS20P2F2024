package src.Mastery;

import java.util.Scanner;

public class PrimeNumberModification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
	        System.out.println("Enter any number:");
	        
	        int num = scan.nextInt();
	    
	        
	        if (isPrime(num)) {
	            System.out.println(num + " is a Prime Number");
	        } else {
	            System.out.println(num + " is not a Prime Number");
	        }
	    }

	 
	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false; 
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false; 
	            }
	        }
	        return true; 
	    }
	}


