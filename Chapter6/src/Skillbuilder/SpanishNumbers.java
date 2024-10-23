package Skillbuilder;

import java.util.Scanner;

public class SpanishNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " - " + getSpanishNumber(i));
        }
 
        int userInput = input.nextInt();
        System.out.println("The number " + userInput + " in Spanish is: " + getSpanishNumber(userInput));

        
    }

    public static String getSpanishNumber(int number) {
        switch (number) {
            case 1: return "uno";
            case 2: return "dos";
            case 3: return "tres";
            case 4: return "cuatro";
            case 5: return "cinco";
            case 6: return "seis";
            case 7: return "siete";
            case 8: return "ocho";
            case 9: return "nueve";
            case 10: return "diez";
            default: return "Número no válido";
        }
    }
}