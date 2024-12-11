package weekThree.labThree;

import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args) {

        //create an instance of the scanner
        Scanner scan = new Scanner(System.in);

        //character
        //prompt
        System.out.println("Enter a leeter grade (A, B, C, D, F): ");
        char letterGrade = scan.nextLine().charAt(0);
        //String name = "Marvellous";
        //System.out.println(name.charAt())

        switch(letterGrade){
            case 'A':
                System.out.println("4.0 GPA");
                break;
            case 'B':
                System.out.println("3.0 GPA");
            case 'C':
                System.out.println("2.0 GPA");
                break;
            case 'D':
                System.out.println("1.0 GPA");
                break;
            case 'F':
                System.out.println("0 GPA");
                break;
            default:
                System.out.println("Invalid letter grade");
                break;
        }

    }
}
