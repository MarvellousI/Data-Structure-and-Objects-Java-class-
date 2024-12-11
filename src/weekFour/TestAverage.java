package weekFour;
import java.util.Scanner;

public class TestAverage {
    int numStudents;
    int numTestsPerStudent;
    int test;
    int student;

    public static void main(String[] args) {
        TestAverage testAvg = new TestAverage();
        testAvg.getInput();
        testAvg.calculateAverages();
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        //number of students
        System.out.print("Enter the number of students: ");
        numStudents = scanner.nextInt();

        // Get the number of test scores per student
        System.out.print("Enter the number of test scores per student: ");
        numTestsPerStudent = scanner.nextInt();
    }

    public void calculateAverages() {
        Scanner scanner = new Scanner(System.in);

        // Iterate over each student
        for (student = 1; student <= numStudents; student++) {
            System.out.println("\nEnter the test scores for the Student " + student + ":");
            double totalScore = 0;

            // Get the test scores for the current student
            for (test = 1; test <= numTestsPerStudent; test++) {
                System.out.print("Enter score for test " + test + ": ");
                double score = scanner.nextDouble();
                totalScore += score;
            }

            // Calculate the average score
            double averageScore = totalScore / numTestsPerStudent;

            // Print the average score
            System.out.printf("Average test score for the Student %d: %.2f\n", student, averageScore);
        }
    }
}
