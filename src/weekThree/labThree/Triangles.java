package weekThree.labThree;

import javax.swing.JOptionPane;
public class Triangles {
    public static void main(String[] args) {
        String side1In = JOptionPane.showInputDialog("Enter the length of the first side: ");
        String side2In = JOptionPane.showInputDialog("Enter the length of the second side: ");
        String side3In = JOptionPane.showInputDialog("Enter the length of the third side: ");

        int S1 = Integer.parseInt(side1In);
        int S2 = Integer.parseInt(side2In);
        int S3 = Integer.parseInt(side3In);

        if (S1 == S2 && S2 == S3) {
            JOptionPane.showMessageDialog(null, "The triangle is an equilateral triangle.");
        } else if (S1 == S2 || S2 == S3 || S1 == S3){
            JOptionPane.showMessageDialog(null, "The triangle is an Isosceles triangle.");
        } else {
            JOptionPane.showMessageDialog(null, "The triangle is a Scalene triangle.");
        }
    }

}
