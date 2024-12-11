package weekFive;
import java.util.Scanner;
public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Declare arrays
        String[] names = new String[3];
        int[] ages = new int[3];
        double[] scores = new double[3];

        // create the arrays
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            names[i] = scnr.nextLine();

            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scnr.nextInt();

            System.out.print("Enter score for " + names[i] + ": ");
            scores[i] = scnr.nextDouble();
            scnr.nextLine(); // Clear the newline character
            }

            // Print the arrays in a table format
            System.out.println("\nName\t\tAge\tScore");
            System.out.println("--------------------------");
            for (int i = 0; i < 3; i++) {
                System.out.printf("%-15s %-5d %-6.2f\n", names[i], ages[i], scores[i]);
            }

        }
    }

