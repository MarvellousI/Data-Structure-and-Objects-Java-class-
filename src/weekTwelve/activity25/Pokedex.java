package weekTwelve.activity25;

import weekTwelve.labEleven.Pokemon;

import java.util.ArrayList;

public class Pokedex {
    private ArrayList<weekTwelve.labEleven.Pokemon> pokemonArrayList = new ArrayList<>();
    // default constructor: public Pokedex() {} --don't need to write
    // <Place comments here>
    public void addPokemon(weekTwelve.labEleven.Pokemon pokemon) {
        pokemonArrayList.add(pokemon);
    }
    public void removePokemon(weekTwelve.labEleven.Pokemon pokemon) {
        pokemonArrayList.remove(pokemon);
    }
    public ArrayList<weekTwelve.labEleven.Pokemon> getAllPokemon() {
        return pokemonArrayList;
    }
    public weekTwelve.labEleven.Pokemon getPokemon(String pokemonName) {
        weekTwelve.labEleven.Pokemon foundPokemon = null;
        for (Pokemon pokemon : pokemonArrayList) {
            if (pokemon.getName().equals(pokemonName)) {
                foundPokemon = pokemon;
                break;
            }
        }
        return foundPokemon;
    }
}
