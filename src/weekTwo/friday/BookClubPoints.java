package weekTwo.friday;

import java.util.Scanner;
public class BookClubPoints {
    public static void main(String args []){
        //prompt userto enter in the number of book purchased

        //using scanner
        Scanner scn = new Scanner(System.in);

        //display a message
        System.out.println("Enter in the number of books purchased");

        //input
        //Declare my variable
        int booksPurchased, points;
        booksPurchased = Integer.parseInt(scn.nextLine());

        //if (){} --> syntax
        if (booksPurchased == 0){
            points = 0;
        }
        else if(booksPurchased == 1){
            points = 5;
        }
        else if(booksPurchased == 2){
            points = 15;
        }
        else if (booksPurchased == 3){
            points = 30;
        }
        else if(booksPurchased >= 4){
            points = 60;
        }else{
            points = -1;
            System.out.println("Invalid Input! ");
        }
        //display results
        //soutf --> System,out,printf("")
        System.out.printf("The amount you are awarded is %d" ,points);

        //closing scanner object
        scn.close();
    }
}
