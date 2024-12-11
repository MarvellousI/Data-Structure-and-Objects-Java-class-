package weekTwelve.fileIO;

import javax.swing.*;
import java.io.*;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        //Syntax try()catch()
        try{
            //instance
            FileWriter fileWriter = new FileWriter("estingFileWirter.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            //declare variables
            String name = JOptionPane.showInputDialog("Enter user the user name:");
            String password = JOptionPane.showInputDialog("Enter user password:");
            String playerCharacter = JOptionPane.showInputDialog("Enter user player character:");
            int score = Integer.parseInt(JOptionPane.showInputDialog("Enter user score:"));
            double winningPercent = Double.parseDouble(JOptionPane.showInputDialog("Enter user winning percent:"));

            //Write to the file
            output.printf("%n%-20s %-20s %6d %23s %15.2f", name, password, playerCharacter, score, winningPercent);

            //close
            fileWriter.close();
            output.close();

        }catch(FileNotFoundException e){
            System.err.println("**** Your file was not found. Fix it!!!! ******");
        }
    }
}
