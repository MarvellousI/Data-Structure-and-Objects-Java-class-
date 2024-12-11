package weekThree.labThree;

import javax.swing.JOptionPane;
public class Login {

    public static void main(String[] args) {
        //Login login= new Login();
       // login.performLogin();

        String userName = "cs121";
        String password = "password123";

        String name = JOptionPane.showInputDialog("Enter your username: ");
        String pw = JOptionPane.showInputDialog("Enter your password: ");

        if (name.equals(userName) && pw.equals(password)) {
            JOptionPane.showMessageDialog(null, "Welcome to CS121.");
        } else if (name.equals(userName)) {
            JOptionPane.showMessageDialog(null, "Incorrect password.");
        } else if (pw.equals (password)){
            JOptionPane.showMessageDialog(null, "Incorrect username." );
        } else {
            JOptionPane.showMessageDialog(null, "Both username and password are incorrect.");
        }
    }
}
