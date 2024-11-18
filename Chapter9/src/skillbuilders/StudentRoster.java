package skillbuilders;  

import java.util.Scanner;  

public class StudentRoster { 

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students in the class: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

      
        String[] studentNames = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
        }

      
        System.out.println("\nStudent Roster");
        for (String name : studentNames) {
            System.out.println(name);
        }

    }
}
