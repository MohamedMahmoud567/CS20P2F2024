/*

Program: Math tutor program Java         Date: October 3, 2024

Purpose: Create a math tutor.


School: CHHS
Course: Computer Science 20
 
*/


package src.Mastery;
import java.util.Scanner;
import java.util.Random;
public class Mathtutor {
   public static void main(String[] args) {
      
       Scanner winner = new Scanner(System.in);
       Random Random = new Random();
      
       int RandomNUM1 = Random.nextInt(10); 
       int RandomNUM2 = Random.nextInt(10);
      
      
       System.out.println("choose the math symbol that you need help with for today (+, -, *, /): ");
      
       String mathSymbol = winner.next();
      
       double computeranswer = 0;
       boolean CORRECTMATHSYMBOL = true;
      
       switch (mathSymbol) {
           case "+":
           	computeranswer = RandomNUM1 + RandomNUM2;
               break;
           case "-":
           	computeranswer = RandomNUM1 - RandomNUM2;
               break;
           case "*":
           	computeranswer = RandomNUM1 * RandomNUM2;
               break;
           case "/":
               if (RandomNUM2 != 0) {
               	computeranswer = RandomNUM1 / (double) RandomNUM2; 
               } else {
                   System.out.println("can't divide by zero.");
                   CORRECTMATHSYMBOL = false; 
               }
               break;
           default:
               System.out.println("Invalid Math Symbol.");
               CORRECTMATHSYMBOL = false;
       }
      
       if (CORRECTMATHSYMBOL) {
           System.out.println("What is the answer of " + RandomNUM1 + " " + mathSymbol + " " + RandomNUM2 + "?");
           double youranswer = winner.nextDouble();
          
           if (youranswer == computeranswer) {
               System.out.println("You got it right " + computeranswer );
          
           } else if (youranswer == 0) {
               System.out.println("WRONG, Here's the anwser : " + computeranswer );
               System.out.println("want to try again.");
          
           } else {
       
               System.out.println("Wrong! The correct answer is " + computeranswer);
           }
       }
   }
}



/*
Screen dump test case 1


choose the math symbol that you need help with for today (+, -, *, /): 
+
What is the answer of 7 + 8?
13
Wrong! The correct answer is 15.0



Test case 2




choose the math symbol that you need help with for today (+, -, *, /): 
-
What is the answer of 8 - 2?
6
You gogt it right 6.0


*/

