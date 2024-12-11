package weekThree;


import java.util.Scanner;
public class Rest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        System.out.println("Is there anyone at the party that is vegetarian? (yes/no)");
        String vegetarian = scanner.nextLine().trim().toLowerCase();
        System.out.println("Is there anyone at the party that is vegan? (yes/no)");
        String vegan = scanner.nextLine().trim().toLowerCase();
        System.out.println("Is there anyone at the party that is gluten-free? (yes/no)");
        String glutenFree = scanner.nextLine().trim().toLowerCase();

        System.out.println("Here are your restaurant choices: \n");

        if (vegetarian.equals("yes") && vegan.equals("yes") && glutenFree.equals("yes")) {
            System.out.println("Corner Cafe");
            System.out.println("The Chef's Kitchen");
        } else if (vegetarian.equals("yes") && vegan.equals("no") && glutenFree.equals("yes")) {
            System.out.println("Main Street Pizza Company");
        } else if (vegetarian.equals("no") && vegan.equals("no") && glutenFree.equals("no")) {
            System.out.println("Joe's Gourmet Burger");
        } else if (vegetarian.equals("yes") && vegan.equals("no") && glutenFree.equals("no")) {
            System.out.println("Mama's Fine Italian");
        } else if (vegetarian.equals("yes") && vegan.equals("yes") && glutenFree.equals("no")) {
            System.out.println("The Chef's Kitchen");
        } else {
            System.out.println("The Chef's Kitchen");
        }

        // Close the scanner
        scanner.close();
    }
}