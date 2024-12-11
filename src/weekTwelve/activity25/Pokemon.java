package weekTwelve.activity25;

import weekTwelve.labEleven.Move;

import java.util.ArrayList;

public class Pokemon {
    // <Place comments here>
    private String name;
    private int hp;
    private ArrayList<weekTwelve.labEleven.Move> moveArrayList = new ArrayList<>();
    // <Place comments here>
    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public ArrayList<weekTwelve.labEleven.Move> getMoveArrayList() {
        return moveArrayList;
    }
    public void addMove(weekTwelve.labEleven.Move move) {
        moveArrayList.add(move);
    }
    public void removeMove(weekTwelve.labEleven.Move move) {
        moveArrayList.remove(move);
    }
    public ArrayList<weekTwelve.labEleven.Move> getAllMoves() {
        return moveArrayList;
    }
    public weekTwelve.labEleven.Move getMove(String moveName) {
        weekTwelve.labEleven.Move foundMove = null;
        for (Move move : moveArrayList) {
            if (move.getMoveName().equals(moveName)) {
                foundMove = move;
                break;
            }
        }
        return foundMove;
    }
    @Override
    public String toString() {
        return String.format("Name: %s\n" + "HP: %d\n", name, hp);
    }

}
