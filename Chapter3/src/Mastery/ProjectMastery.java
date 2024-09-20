/*

Program: Project_Mastery.java          Date: September 19, 2008

Purpose: analyze time taken.


School: CHHS
Course: Computer Science 20
 
*/


package Mastery;

import java.util.Scanner;

public class ProjectMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Create new scanner
        Scanner input = new Scanner(System.in);
        
        // promt user to enter first task
        System.out.print("How much time spent Desiging: ");
		  int Task1 = input.nextInt();
		
		//promt user to enter second task
		  System.out.print("How much time spent coding: ");
		  int Task2 = input.nextInt();
		
	    // promt user to enter third task   
		  System.out.print("How much time spent debuging: ");
		  int Task3 = input.nextInt();
		
		  //promt user to enter fourth task  
		  System.out.print("how muchc time spent testing : ");
		  int Task4 = input.nextInt();
		  


		  System.out.println("The average of all tasks together is out of 5 hours: %" + (Task1 + Task2 + Task3 + Task4 / 4));
	 }
	}



/* Screen Dump


How much time spent Designing: 23
How much time spent coding: 12
How much time spent debugging: 45
how much time spent testing : 21
The averagmuchctimee of all tasks together is out of 5 hours: %80

 


 
 */


