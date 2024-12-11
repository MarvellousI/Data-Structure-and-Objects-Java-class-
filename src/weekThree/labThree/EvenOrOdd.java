package weekThree.labThree;

import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String args [])
    {
        Scanner scn = new Scanner(System.in);

        //prompt user to enter a number
        System.out.print("Enter a number: ");

            int number;
            number = scn.nextInt();
        if (number % 2 == 0){
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number "  + number  + " is odd.");
        }

    }

}
