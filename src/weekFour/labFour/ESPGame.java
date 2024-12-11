package weekFour.labFour;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);
            // Create a Random object to generate random numbers
            //Random random = new Random();

            // Array of colors for the game
            String[] colors = {"red", "green", "blue", "orange", "yellow", "purple", "lavender", "mint", "white",};

            // Variable to count the number of correct guesses
            int correctGuesses = 0;

            // Number of rounds to play
            int totalRounds = 10;

            // For loop to repeat the game 10 times
            for (int i = 0; i < totalRounds; i++) {
                // Generate a random index to select a color
                int randomIndex = (int)(Math.random() * colors.length);
                // Get the randomly selected color
                String selectedColor = colors[randomIndex];

                // Ask the user to guess the color
                System.out.print("Guess the color (red, green, blue, orange, yellow, purple, lavender, mint, white): ");
                // Read the user's guess and convert it to lowercase
                String userGuess = scanner.nextLine().toLowerCase();

                // Display the randomly selected color
                System.out.println("The selected color is: " + selectedColor);

                // Check if the user's guess matches the selected color
                if (userGuess.equals(selectedColor)) {
                    correctGuesses++;
                    System.out.println("Correct guess!");
                } else {
                    System.out.println("Incorrect guess.");
                }
                System.out.println(); // Print a blank line for better readability
            }

            // Print the total number of correct guesses after all rounds
            System.out.println("You guessed correctly " + correctGuesses + " out of " + totalRounds + " times.");

        }
    }

