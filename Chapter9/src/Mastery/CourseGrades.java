/*

Program: CourseGrades      Date: November 18, 2024

Purpose: This program will take in 12 students and 5 tests inputed and tally up the avaerage for each person


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner;

public class CourseGrades {
    private final int NUM_STUDENTS = 12;
    private final int NUM_TESTS = 5;
    private int[][] grades = new int[NUM_STUDENTS][NUM_TESTS];

    // Method to get grades from the user
    public void getGrades() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Enter grades for Student " + (i + 1) + ":");
            for (int j = 0; j < NUM_TESTS; j++) {
                System.out.print("Test " + (j + 1) + ": ");
                grades[i][j] = scanner.nextInt();
            }
        }
    }

    // display all grades
    public void showGrades() {
        System.out.println("\nGrades for all students:");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < NUM_TESTS; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

    // calculate average for either a student or a test
    private double calculateAverage(int index, boolean isStudent) {
        int total = 0;
        if (isStudent) {
            for (int j = 0; j < NUM_TESTS; j++) {
                total += grades[index][j];
            }
            return (double) total / NUM_TESTS;
        } else {
            for (int i = 0; i < NUM_STUDENTS; i++) {
                total += grades[i][index];
            }
            return (double) total / NUM_STUDENTS;
        }
    }

 
    public double studentAvg(int studentNumber) {
        return calculateAverage(studentNumber - 1, true);
    }

 
    public double testAvg(int testNumber) {
        return calculateAverage(testNumber - 1, false);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseGrades gradeBook = new CourseGrades();

        // Get grades and show them
        gradeBook.getGrades();
        gradeBook.showGrades();

        // Display student average
        System.out.print("\nEnter student number (1-12) to see their average: ");
        int studentNumber = scanner.nextInt();
        System.out.println("Average grade for Student " + studentNumber + ": " + gradeBook.studentAvg(studentNumber));

        // Display test average
        System.out.print("\nEnter test number (1-5) to see the average grade: ");
        int testNumber = scanner.nextInt();
        System.out.println("Average grade for Test " + testNumber + ": " + gradeBook.testAvg(testNumber));
    }
}




/* screen dump

Enter grades for Student 1:
Test 1: 5
Test 2: 78
Test 3: 34
Test 4: 35
Test 5: 90
Enter grades for Student 2:
Test 1: 12
Test 2: 45
Test 3: 34
Test 4: 5
Test 5: 6
Enter grades for Student 3:
Test 1: 75
Test 2: 78
Test 3: 56
Test 4: 89
Test 5: 09
Enter grades for Student 4:
Test 1: 68
Test 2: 35
Test 3: 67
Test 4: 89
Test 5: 57
Enter grades for Student 5:
Test 1: 34
Test 2: 4
Test 3: 6
Test 4: 75
Test 5: 7
Enter grades for Student 6:
Test 1: 7
Test 2: 57
Test 3: 35
Test 4: 86
Test 5: 35
Enter grades for Student 7:
Test 1: 57
Test 2: 96
Test 3: 35
Test 4: 100
Test 5: 57
Enter grades for Student 8:
Test 1: 35
Test 2: 45
Test 3: 84
Test 4: 64
Test 5: 12
Enter grades for Student 9:
Test 1: 67
Test 2: 46
Test 3: 24
Test 4: 74
Test 5: 24
Enter grades for Student 10:
Test 1: 68
Test 2: 97
Test 3: 45
Test 4: 86
Test 5: 9
Enter grades for Student 11:
Test 1: 35
Test 2: 788
Test 3: 53
Test 4: 67
Test 5: 46
Enter grades for Student 12:
Test 1: 24
Test 2: 57
Test 3: 90
Test 4: 12
Test 5: 100

Grades for all students:
Student 1: 5 78 34 35 90 
Student 2: 12 45 34 5 6 
Student 3: 75 78 56 89 9 
Student 4: 68 35 67 89 57 
Student 5: 34 4 6 75 7 
Student 6: 7 57 35 86 35 
Student 7: 57 96 35 100 57 
Student 8: 35 45 84 64 12 
Student 9: 67 46 24 74 24 
Student 10: 68 97 45 86 9 
Student 11: 35 788 53 67 46 
Student 12: 24 57 90 12 100 

Enter student number (1-12) to see their average: 2
Average grade for Student 2: 20.4

Enter test number (1-5) to see the average grade: 3
Average grade for Test 3: 46.916666666666664


*/