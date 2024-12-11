package weekFour;
import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            // Ask for the number of years
            System.out.print("Enter the number of years: ");
            int numYears = scanner.nextInt();

            // Initialize variables to store total rainfall and total months
            double totalRainfall = 0;
            int totalMonths = 0;

            // Loop through each year
            for (int year = 1; year <= numYears; year++) {
                System.out.println("\nEntering rainfall data for Year " + year + ":");

                // Loop through each month of the current year
                for (int month = 1; month <= 12; month++) {
                    System.out.print("Enter rainfall for month " + month + " (in inches): ");
                    double rainfall = scanner.nextDouble();

                    // Add the rainfall to the total and increment the month count
                    totalRainfall += rainfall;
                    totalMonths++;
                }
            }

            // Calculate the average rainfall per month
            double averageRainfall = totalRainfall / totalMonths;

            // Print the results
            System.out.println("\nNumber of months: " + totalMonths);
            System.out.printf("Total inches of rainfall: %.2f\n", totalRainfall);
            System.out.printf("Average rainfall per month: %.2f\n", averageRainfall);

        }
    }


