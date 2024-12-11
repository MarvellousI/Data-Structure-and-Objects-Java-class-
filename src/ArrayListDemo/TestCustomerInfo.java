package ArrayListDemo;
import java.util.Scanner;
public class TestCustomerInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SystemManagement systemManagement = new SystemManagement();

        while (true) {
            System.out.print("Enter course name (or 'q' to quit): ");
            String course = scanner.nextLine();
            if (course.equals("q")) {
                break;
            }
            systemManagement.addCourse(course);

            System.out.print("Enter GPA for " + course + ": ");
            double gpa = scanner.nextDouble();
            systemManagement.addGPA(gpa);

            System.out.print("Enter score for " + course + ": ");
            int score = scanner.nextInt();
            systemManagement.addScore(score);
            scanner.nextLine(); // Consume the newline character
        }

        // Display all information
        systemManagement.displayCourses();
        systemManagement.displayGPAs();
        systemManagement.displayScores();
    }
}

