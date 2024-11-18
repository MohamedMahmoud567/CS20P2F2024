package skillbuilders;

public class Squares {

    public static void main(String[] args) {
     
        
    	int[] squaresArray = new int[5];

    
        for (int i = 0; i < squaresArray.length; i++) {
            squaresArray[i] = i * i;
        }

    
        System.out.println("Squares Array:");
        for (int i = 0; i < squaresArray.length; i++) {
            System.out.println("Element at index " + i + " = " + squaresArray[i]);
        }
    }
}

