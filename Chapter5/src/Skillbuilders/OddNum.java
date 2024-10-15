package Skillbuilders;

import java.util.Scanner;

public class OddNum {

	public static void main(String[] args) {
		
        int min, max;
		
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("Enter a minimum number: ");
		min = input.nextInt();
		
		System.out.println("Enter a maximum number: ");
		max = input.nextInt();
		
	
		System.out.println("Odd numbers: ");
		
		 int x;
	      for(x=min;x<=max;x++)
	      {
	    	  if(x%2==1)
	    	  {
	    		  System.out.println(x);
	    	  }
	      }
	    }
}

