package weekTwo;

import javax.swing.*;

public class wordGame {
    //main + tab
    public static void main(String[] args){
        String name ;
        String city;
        String age;
        String career;
        String college;
        String animal;
        String petName;

        //Prompt user
        //JOption Pane
       name = JOptionPane.showInputDialog("Enter in your name: ");
       city = JOptionPane.showInputDialog("Where are you from: ");
       age = JOptionPane.showInputDialog("Enter your age: ");
       career = JOptionPane.showInputDialog("Enter your future career: ");
       college = JOptionPane.showInputDialog("What is the name of the college you attend: ");
       petName = JOptionPane.showInputDialog("What name are you mostly likely to give your pet");
       animal = JOptionPane.showInputDialog("Enter a type of animal you are most likely to get: ");

       //String.format() --> generate a message
       //Staring the message in a formatted way in the variable message.
       String message = String.format("The person %s is from %s,Nigeria. She is %s years old. She wants to be a %s in the future. I attend %s. She is most likely to get a %s. I'd name my pet %s.",name ,city ,age ,career  ,college ,animal ,petName);

       //System.out.printf("The person %s is from Mustang,Ok. They are at Ball State University.", name);

       //Display message
        JOptionPane.showMessageDialog(null,message);


    }

}
