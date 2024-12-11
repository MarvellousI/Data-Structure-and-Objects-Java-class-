package weekTwelve.fileIO;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[]args) throws FileNotFoundException{

        File outputFile = new File ("TestingFileWrite'txt");
        PrintWriter output = new PrintWriter(outputFile);

        Scanner scan = new Scanner(System.in);

        //header
        output.printf("%-20s %-20s %-17s %-20s %-20s", "<User Name>", "<Password>", "<Score>", "<Player Character>","<Winning Percent>");

        //Declare
        String name, password, playerCharacter;
        int score;
        double winningPercent;

        for(int i = 0; i < 2; i++){
            name = JOptionPane.showInputDialog(String.format("Enter user %d's user name:", (i +1)));
            password = JOptionPane.showInputDialog(String.format("Enter user %d's password:", (i +1)));
            playerCharacter = JOptionPane.showInputDialog(String.format("Enter user %d's character:", (i +1)));
            //int
            score = Integer.parseInt(JOptionPane.showInputDialog(String.format("Enter user %d's password:", (i +1))));
            //double
            winningPercent = Double.parseDouble(JOptionPane.showInputDialog(String.format("Enter use %d's winning percentage: ", i)));

            output.printf("%n%-20s %-20s %6d %17s %15.2f", name, password, playerCharacter, score, winningPercent);
        }
        scan.close();
        output.close();
    }


}
