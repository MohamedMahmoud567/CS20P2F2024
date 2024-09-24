package skillbuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
     
		   //create a new Scanner
        Scanner input = new Scanner(System.in);
        
        int tens = 0;
        int ones;
      
        System.out.print("Enter a 2 digit number: ");
        int number = input.nextInt();


        tens = (number - (tens*1)) / 10;  
        System.out.printf(" Tens place digit: " + tens);

        ones = (number - (tens*10)) ;  
        System.out.printf(" Ones place digit: " + ones);   
}
                         
                                                                    



}



