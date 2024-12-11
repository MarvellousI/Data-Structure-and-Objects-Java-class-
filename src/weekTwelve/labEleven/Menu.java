package weekTwelve.labEleven;

import java.util.Scanner;
public class Menu {
    //create variables (instance)
    private Scanner scn = new Scanner(System.in);
    private Pokedex pokedex = new Pokedex();

    public void displayMenu() {
        boolean keepRunning = true;

        while (keepRunning) {
            //menu
            System.out.print("******Menu******\n");
            System.out.print("Please make a selection:\n");
            System.out.println("1: Add a Pokemon");
            System.out.println("2: Remove a Pokemon");
            System.out.println("3: Display Pokemon Info");
            System.out.println("4; Display All Pokemon Info");
            System.out.println("5: Exit");

            String choice = scn.nextLine();

            //choices
            if (choice.equals("1")) {
                createPokemon();
            } else if (choice.equals("2")) {
                deletePokemon();
            } else if (choice.equals("3")) {
                displayPokemon();
            } else if (choice.equals("4")) {
                displayAllPokemon();
            } else if (choice.equals("5")) {
                keepRunning = false;
                System.out.println("End......");
            } else {
                System.out.println("Invalid entry");
            }
        }
    }

    private void createPokemon() {
        System.out.print("Enter Pokemon name: ");
        String name = scn.nextLine();
        System.out.print("Enter Pokemon HP: ");
        int hp = scn.nextInt();
        scn.nextLine();

        Pokemon newPokemon = new Pokemon(name, hp);

        while (true) {
            System.out.print("Enter a move name (or 'q' to quit): ");
            String moveName = scn.nextLine();

            if (moveName.equals("q")) {
                break;
            }

            System.out.print("Enter move power: ");
            int movePower = scn.nextInt();
            System.out.print("Enter move speed: ");
            int moveSpeed = scn.nextInt();
            scn.nextLine();  // Consume the leftover newline

            // Create the move and add it to the Pokemon
            Move move = new Move(moveName, movePower, moveSpeed);
            newPokemon.addMove(move);
        }

        // Add the new Pokemon to the Pokedex
        pokedex.addPokemon(newPokemon);
        System.out.println(name + " has been added to the Pokedex.");
    }

    // Method to delete a Pokemon from the Pokedex
    private void deletePokemon() {
        System.out.print("Enter the name of the Pokemon to delete: ");
        String name = scn.nextLine();

        // Find the Pokemon in the Pokedex
        Pokemon pokemonToDelete = pokedex.getPokemon(name);

        if (pokemonToDelete == null) {
            System.out.println("Pokemon not found.");
        } else {
            pokedex.removePokemon(pokemonToDelete);
            System.out.println(name + " has been removed from the Pokedex.");
        }
    }

    // Method to display a specific Pokemon's details
    private void displayPokemon() {
        System.out.print("Enter the name of the Pokemon to display: ");
        String name = scn.nextLine();

        // Find the Pokemon in the Pokedex
        Pokemon pokemon = pokedex.getPokemon(name);

        if (pokemon == null) {
            System.out.println("Pokemon not found.");
        } else {
            System.out.println(pokemon);
            System.out.println("Moves:");
            for (Move move : pokemon.getAllMoves()) {
                System.out.println(move);
            }
        }
    }

    // Method to display all Pokemon in the Pokedex
    private void displayAllPokemon() {
        System.out.println("All Pokemon in Pokedex:");
        for (Pokemon pokemon : pokedex.getAllPokemon()) {
            System.out.println(pokemon);
            System.out.println("Moves:");
            for (Move move : pokemon.getAllMoves()) {
                System.out.println(move);
            }
            System.out.println();
        }
    }

}