package projectOne;
import java.util.Random;
import java.util.Scanner;
public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter an odd number of rounds: ");
        int rounds = scanner.nextInt();

        // Ensure rounds is odd
        while (rounds % 2 == 0) {
            System.out.print("Please enter an odd number: ");
            rounds = scanner.nextInt();
            }

        int player1Wins = 0;
        int player2Wins = 0;

        for (int i = 0; i < rounds; i++) {
            System.out.println("\n--- Round " + (i + 1) + " ---");

            // Player 1 character stats
            System.out.print("\nEnter player 1: ");
            String name1 = scanner.next();
            System.out.print("Enter hit points: ");
            int hitPoints1 = scanner.nextInt();
            System.out.println("Enter move name: ");
            String move1 = scanner.next();
            System.out.println("Enter move power: ");
            int power1 = scanner.nextInt();
            System.out.println("Enter attack speed: ");
            int speed1 = scanner.nextInt();

            // Player 2 character stats
            System.out.print("\n Enter player 2 : ");
            String name2 = scanner.next();
            System.out.print("Enter hit points: ");
            int hitPoints2 = scanner.nextInt();
            System.out.println("Enter move name: ");
            String move2 = scanner.next();
            System.out.println("Enter move power: ");
            int power2 = scanner.nextInt();
            System.out.println("Enter attack speed: ");
            int speed2 = scanner.nextInt();

            // Determine the first attacker based on speed
            boolean player1First = false;

            if (speed1 > speed2) {
                player1First = true;
                } else if (speed1 < speed2) {
                player1First = false;
                } else {

                // Randomly choose who attacks first if speeds are equal
                player1First = random.nextBoolean();
                }

            // Battle logic
            while (hitPoints1 > 0 && hitPoints2 > 0) {
                if (player1First) {
                    // Player 1 attacks
                    hitPoints2 -= power1;

                    if (hitPoints2 <= 0) {
                        System.out.println(name2 + " is defeated! " + name1 + " wins this round!");
                        player1Wins++;
                        break;
                        }

                    // Player 2 attacks
                    hitPoints1 -= power2;

                    if (hitPoints1 <= 0) {
                        System.out.println(name1 + " is defeated! " + name2 + " wins this round!");
                        player2Wins++;
                        break;
                        }
                    } else {
                    // Player 2 attacks first
                    hitPoints1 -= power2;

                    if (hitPoints1 <= 0) {
                        System.out.println(name1 + " is defeated! " + name2 + " wins this round!");
                        player2Wins++;
                        break;
                        }

                    // Player 1 attacks
                    hitPoints2 -= power1;

                    if (hitPoints2 <= 0) {
                        System.out.println(name2 + " is defeated! " + name1 + " wins this round!");
                        player1Wins++;
                        break;
                        }
                    }
                }
            }

        // Final scores
        System.out.println("\n--- Final Scores ---");
        System.out.println("Player 1 Wins: " + player1Wins);
        System.out.println("Player 2 Wins: " + player2Wins);

        // Determine overall winner
        if (player1Wins > player2Wins) {
            System.out.println("Hurray Player 1 is the winner!");
            } else if (player2Wins > player1Wins) {
            System.out.println("Hurray Player 2 is the winner!");
            } else {
            System.out.println("It's a tie!");
            }
    }
}