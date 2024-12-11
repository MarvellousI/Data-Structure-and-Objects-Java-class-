package project2;

import java.util.Random;
import java.util.Scanner;

public class TestScores {
    private static final int SIZE = new Random().nextInt(5) + 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        // Print test scores
        System.out.println("Enter your " + SIZE + " test scores:");

        // Test scores array
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter Test Score " + (i + 1) + ": ");
            testScores[i] = scanner.nextInt();
        }
        getLetterGrade(testScores, SIZE, letterGrades);
        printGrades(SIZE, testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);
    }
    public static void getLetterGrade(int[] testScores, int SIZE, char[] letterGrades) {
        char grade;
        for (int i = 0; i < SIZE; i++) {
            if (testScores[i] >= 90) {
                letterGrades[i] = 'A';
            } else if (testScores[i] >= 80) {
                letterGrades[i] = 'B';
            } else if (testScores[i] >= 70) {
                letterGrades[i] = 'C';
            } else if (testScores[i] >= 60) {
                letterGrades[i] = 'D';
            } else if (testScores[i] >= 50) {
                letterGrades[i] = 'E';
            } else {
                letterGrades[i] = 'F';
            }
        }
    }
    private static void printGrades( int SIZE, int[] testScores, char[] letterGrades) {
        System.out.printf("%-12s%s\n","Score", "Grade ");
        System.out.println("-".repeat(17));
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%-12d%s\n", testScores[i], letterGrades[i]);
        }
    }

    private static void printHighestScore(int[] scores) {
        int highGrade = scores[0];
        for (int score : scores) {
            if (score > highGrade) {
                highGrade = score;
            }
        }
        System.out.println("\nThe Highest Score Is: " + highGrade);
    }

    private static void printLowestScore(int[] scores) {
        int lowGrade = scores[0];
        for (int score : scores) {
            if (score < lowGrade) {
                lowGrade = score;
            }
        }
        System.out.println("The Lowest Score Is: " + lowGrade);
    }

    private static void printAverageScore(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / scores.length;
        System.out.printf("Average score is: %.2f%n", average);
    }
}
