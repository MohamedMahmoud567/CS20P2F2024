package skillbuilders;

import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String phrase = scanner.nextLine(); 

       
        int[] letterCounts = new int[26]; 

   
        phrase = phrase.toLowerCase();


        for (int i = 0; i < phrase.length(); i++) {
            char currentChar = phrase.charAt(i);

           
            if (currentChar >= 'a' && currentChar <= 'z') {   
                letterCounts[currentChar - 'a']++;
            }
        }

      
        System.out.println("Letter counts:");
        for (int i = 0; i < letterCounts.length; i++) {
            if (letterCounts[i] > 0) 
                System.out.println((char) (i + 'a') + ": " + letterCounts[i]);
            }
        }

   
    }


