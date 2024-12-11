package weekTwelve.activity25;

import weekTwelve.labEleven.Move;
import weekTwelve.labEleven.Pokemon;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    // Instance variables
    private Scanner scn = new Scanner(System.in);
    private Pokedex pokedex = new Pokedex();

    public void displayMenu() {
        boolean keepRunning = true;

        while (keepRunning) {
            // Menu
            System.out.println("******Menu******");
            System.out.println("Please make a selection:");
            System.out.println("1: Add a Pokemon");
            System.out.println("2: Remove a Pokemon");
            System.out.println("3: Display Pokemon Info");
            System.out.println("4: Display All Pokemon Info");
            System.out.println("5: Exit");

            String choice = scn.nextLine();

            // Choices
            switch (choice) {
                case "1":
                    createPokemon();
                    break;
                case "2":
                    deletePokemon();
                    break;
                case "3":
                    displayPokemon();
                    break;
                case "4":
                    displayAllPokemon();
                    break;
                case "5":
                    keepRunning = false;
                    System.out.println("End......");
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }
        }
    }

    private void createPokemon() {
        int userChoice;
        scn.nextLine();  // Consume any leftover newline character from previous input

        // Prompt to choose how to enter the correct character info
        System.out.println("Would you like to (1) enter Pokemon details manually or (2) select from file?");
        userChoice = Integer.parseInt(scn.nextLine());

        if (userChoice == 1) {
            System.out.print("Enter Pokemon name: ");
            String name = scn.nextLine();
            System.out.print("Enter Pokemon HP: ");
            int hp = Integer.parseInt(scn.nextLine());

            Pokemon pokemon = new Pokemon(name, hp);
            addMovesToPokemon(pokemon);

            // Add the new Pokemon to the Pokedex
            pokedex.addPokemon(pokemon);
            System.out.println(name + " has been added to the Pokedex.");
        } else if (userChoice == 2) {
            FileRead fileReader = new FileRead();
            ArrayList<String[]> pokemonData;
            try {
                pokemonData = fileReader.readPokemonData("CharacterStatsFile.txt");

                if (pokemonData.isEmpty()) {
                    System.out.println("No Pokemon data available in file.");
                    return;
                }

                // Display options from file
                for (int i = 0; i < pokemonData.size(); i++) {
                    System.out.printf("%d : %s\n", i + 1, pokemonData.get(i)[0]);
                }

                int selectedIndex = Integer.parseInt(scn.nextLine()) - 1;

                if (selectedIndex >= 0 && selectedIndex < pokemonData.size()) {
                    String[] selectedPokemonData = pokemonData.get(selectedIndex);
                    String name = selectedPokemonData[0];
                    int hp = Integer.parseInt(selectedPokemonData[1]);
                    String moveName = selectedPokemonData[2];
                    int movePower = Integer.parseInt(selectedPokemonData[3]);
                    int moveSpeed = Integer.parseInt(selectedPokemonData[4]);

                    Pokemon pokemon = new Pokemon(name, hp);
                    Move move = new Move(moveName, movePower, moveSpeed);
                    pokemon.addMove(move);

                    // Add the new Pokemon to the Pokedex
                    pokedex.addPokemon(pokemon);
                    System.out.println("The Pokemon has been added to the Pokedex from the file data.");
                } else {
                    System.err.println("Error: Invalid selection.");
                }
            } catch (FileNotFoundException e) {
                System.err.println("Error: Pokemon Data File Not Found");
            }
        } else {
            System.err.println("Invalid Entry in createPokemon method.");
        }
    }

    private void addMovesToPokemon(Pokemon pokemon) {
        //add code
        while (true) {
            System.out.print("Enter a move name or q if finished: ");
            String moveName = scn.nextLine();

            if (moveName.equalsIgnoreCase("q")) {
                break;
            }
            System.out.print("Enter move power: ");
            int movePower = Integer.parseInt(scn.nextLine());
            System.out.print("Enter move speed: ");
            int moveSpeed = Integer.parseInt(scn.nextLine());

            Move move = new Move(moveName, movePower, moveSpeed);
            pokemon.addMove(move);
        }
    }

    //modify
    private void displayAllPokemon() {
        ArrayList<Pokemon>pokemonArrayList = pokedex.getAllPokemon();
        //if statement
        if(pokemonArrayList.isEmpty()){
            System.out.println("No Pokemon in the Pokedex!");

        }
        //enhanced for loop
        System.out.println("All Pokemon in the Pokedex");
        for (Pokemon pokemon : pokemonArrayList) {
            System.out.printf("Name: %s\n", pokemon.getName());
            System.out.printf("HP: %d\n", pokemon.getHp());

            ArrayList<Move> movesArrayList = pokemon.getMoveArrayList();
            if(movesArrayList.isEmpty()){
                System.out.println("No moves available for this pokemon!");
            }else {
                System.out.println("Moves:\n");
                //enhanced for loop
                for(Move move: movesArrayList){
                    System.out.printf("\t\t Move Names: %s\n", move.getMoveName());
                    System.out.printf("\t\t Move Power: %d\n", move.getMovePower());
                    System.out.printf("\t\t Move Speed: %d\n", move.getMoveSpeed());

                }
            }
            System.out.println();

        }
    }

    private void deletePokemon() {
        System.out.print("Enter the name of the Pokemon to delete: ");
        String name = scn.nextLine();

        Pokemon pokemonToDelete = pokedex.getPokemon(name);

        if (pokemonToDelete == null) {
            System.out.println("Pokemon not found.");
        } else {
            pokedex.removePokemon(pokemonToDelete);
            System.out.println(name + " has been removed from the Pokedex.");
        }
    }

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

}
