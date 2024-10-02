package skillbuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		

		Scanner userInput = new Scanner(System.in);
	       
	        System.out.print("Which category did the Hurricane display :   ");
	       
	        int category = userInput.nextInt();
	       
	         int mph = 0, knots = 0, kmph = 0;


	           switch(category) {


	             case 1: mph = 75-95 ; knots =  65-85 ; kmph = 120-155 ;    break;
	                         
	             case 2: mph = 95-110  ; knots =  80-95 ; kmph = 155-177 ; break;
	                         
	             case 3: mph = 111-130  ; knots =  96-113 ; kmph = 178-209 ; break;
	                         
	             case 4:  mph = 131-155 ; knots =  114-135 ; kmph = 210-249     ; break;
	                         
	             case 5: mph = + 155 ; knots =  + 135 ; kmph = + 249  ; break;
	             
	             default:
	                    System.out.println("Invalid category entered.");  
	                         
	        }  	           
	           System.out.println(" here's the mph " + mph );
	           	           
	           System.out.println(" here's the knots " + knots);
	            
	           System.out.println(" here's the kmph " +  kmph);
	           
	           
	           
	       
	    }


	
}


	


