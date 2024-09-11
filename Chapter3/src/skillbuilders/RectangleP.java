package skillbuilders;

import java.util.*;

public class RectangleP {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner (System.in);
		
		//Declaration and initialization
		System.out.print("Please enter a Length value: ");
		int Length = userInput.nextInt();
		
		System.out.print("Please enter a Width value: ");
        int width =  userInput.nextInt();
        
        int area = Length * width;
        
        System.out.print("The area of the rectangle is: " + area);
	}

}
