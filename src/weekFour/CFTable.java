package weekFour;

import java.util.Scanner;
public class CFTable {
    public static void main(String[] args) {
        System.out.printf("%-10s %-15s%n", "Celsius", "Fahrenheit");
        System.out.println("----------------");

        for (int celsius = 0; celsius <= 20; celsius++) {
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.printf("%-10d %-15.2f%n", celsius, fahrenheit);
        }
    }


}
