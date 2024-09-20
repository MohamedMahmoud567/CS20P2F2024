package skillbuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
     
		   //create a new Scanner
        Scanner input = new Scanner(System.in);
        
        int tens = 0;
        int ones = 0;
      
        System.out.print("Enter a 2 digit number: ");
        int number = input.nextInt();

if (number <= 99 & number < 99)   
{
        tens = (number - (tens*1)) / 10;  
        System.out.printf("\nTens place digit: " + tens);

        ones = (number - (tens*10)) ;  
        System.out.printf("\nOnes place digit: " + ones);   
}
                         
                                                                    
{      
if (number > 99)
        System.out.println("\nError! Number is more then 2 digits, please enter a 2 digit number.");
      
}



}
}


