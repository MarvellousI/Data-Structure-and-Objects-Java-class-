package labSix;
import java.util.Scanner;
public class Rectangle {
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);
        scanner.close();
    }
    //get length() method
    public static double getLength(){
            System.out.print("Enter the length of a rectangle: ");
            double length = Double.parseDouble(scanner.nextLine());
            return length;
    }

    // Method to get the width of the rectangle
    public static double getWidth() {
        System.out.print("Enter the width of a rectangle: ");
        double width = Double.parseDouble(scanner.nextLine());
        return width;
        }
        // Method to calculate the area of the rectangle
    public static double getArea(double length, double width) {
        return length * width;
        }
        // Method to display the rectangle's data
    public static void displayData(double length, double width, double area) {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        }
    }
