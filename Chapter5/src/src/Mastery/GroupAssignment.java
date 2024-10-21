package src.Mastery;

import java.util.Scanner;

public class GroupAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   Scanner input = new Scanner(System.in);
		      
	       System.out.print("Please enter your frist  name: ");
	       String name = input.nextLine();
	      
	       System.out.print("Please enter your last name: ");
	       String lastName = input.nextLine();
	      
	     
	       String firstLetter = lastName.substring(0, 1).toUpperCase();
	      
	       int group;
	       switch (firstLetter) {
	           case "A":
	           case "B":
	           case "C":
	           case "D":
	           case "E":
	           case "F":
	           case "G":
	           case "H":
	           case "I":
	               group = 1;
	               break;
	           case "J":
	           case "K":
	           case "L":
	           case "M":
	           case "N":
	           case "O":
	           case "P":
	           case "Q":
	               group = 2;
	               break;
	           case "R":
	           case "S":
	           case "T":
	           case "U":
	           case "V":
	           case "W":
	           case "X":
	           case "Y":
	           case "Z":
	               group = 3;
	               break;
	           default:
	               group = 0;
	       }
	     
	       if (group > 0) {
	           System.out.println(name + " " + lastName + ", Brilliant your in group " + group + ".");
	       } else {
	           System.out.println("wrong last name. Please try again.");
	       }
	      
	   }
	}



