package weekSix;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        //Array
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
                };

        // Print the array elements using a standard for loop
        System.out.println("Array 1:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
                }
            System.out.println(); // Move to the next line
            }

        // 2. Create and initialize a 2D array of doubles
        double[][] array2 = new double[4][3];
        array2[0][0] = 1.1; array2[0][1] = 1.2; array2[0][2] = 1.3;
        array2[1][0] = 2.1; array2[1][1] = 2.2; array2[1][2] = 2.3;
        array2[2][0] = 3.1; array2[2][1] = 3.2; array2[2][2] = 3.3;
        array2[3][0] = 4.1; array2[3][1] = 4.2; array2[3][2] = 4.3;


        // Print the array elements using an enhanced for loop
        System.out.println("\nArray 2:");
        for (double[] innerArray : array2) {
            for (double value : innerArray) {
                System.out.print(value + " ");
                }

            System.out.println(); // Move to the next line
            }

        // 3. Create and initialize a 2D array of Strings
        String[][] array3 = {
                {"Andy", "Andy", "Andrea"},
                {"John", "Joan", "Joanna"}
                };

                // Print the array elements using an enhanced for loop
                System.out.println("\nArray 3:");
                for (String[] innerArray : array3) {
                    for (String value : innerArray) {
                        System.out.print(value + " ");
                    }
                    System.out.println(); // Move to the next line
                }


    }
}
