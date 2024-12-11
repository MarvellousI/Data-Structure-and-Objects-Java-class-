package weekFour;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        //scanner
        Scanner scn = new Scanner(System.in);
        int guess;
        int number = 40;

        //Prompt
        //System.out.println("Guess a number between 1 and 100, or enter 'q' if you quit: ");

        //input
        //String userGuess = scn.nextLine(); //1 - 100 or q
        boolean q = false;

        while (!q){
            //number of guesses counter

            System.out.println("Guess a number between 1 and 100, or enter 'q' if you quit: ");
            String userGuess = scn.nextLine(); //1 - 100 or q
            if(userGuess.equals ("q"))
            {
                System.out.println("Quitter");
                q = true;
                break;
            } else
            {
                int uGuess = Integer.parseInt(userGuess);

                //guess too high
                if(uGuess > number){
                    System.out.println("Too high");

                } else if(uGuess < number){
                    System.out.println("Too Low");
                    //guess to low
                }
                else {
                    System.out.println("Good guess, you got it");
                    break; //exit the loop
                    //display number of guess
                    //guess is correct
                }

            }
        }
    }
}
