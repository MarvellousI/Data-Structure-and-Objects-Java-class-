package weekFive;

import java.util.Scanner;
public class CopyArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 0: Ask the user for the number of elements.
        System.out.print("Enter number array element: ");
        final int SIZE = scanner.nextInt();

        // Step 0: Declare 4 arrays with the above number.
        int[] array1 = new int[SIZE];
        int[] array2 = new int[SIZE];
        int[] array3 = new int[SIZE];
        int[] array4 = new int[SIZE];

        // Step 1: Initialize and print array1
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter number for index " + i + ": ");
            array1[i] = scanner.nextInt();
            }


        // Print array1
        System.out.println("Array1:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(array1[i] + " ");
            }
        System.out.println();

        // Step 2: Copy array1 to array2 and print array2
        for (int i = 0; i < SIZE; i++) {
            array2[i] = array1[i];
            }
        System.out.println("Array2 - copy:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(array2[i] + " ");
            }
        System.out.println();

        // Step 3: Copy squared elements to array3 and print array3
        for (int i = 0; i < SIZE; i++) {
            array3[i] = array1[i] * array1[i];
            }

        System.out.println("Array3 - squared:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(array3[i] + " ");
            }
        System.out.println();

        // Step 4: Copy array1 in reverse to array4 and print array4
        for (int i = 0; i < SIZE; i++) {
            array4[i] = array1[SIZE - 1 - i];
            }
        System.out.println("Array4 - reversed:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(array4[i] + " ");
            }

        System.out.println();

    }
}
