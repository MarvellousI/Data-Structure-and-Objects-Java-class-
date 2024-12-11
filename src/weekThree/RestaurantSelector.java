package weekThree;

import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Vegetarian, Vegan, GlutenFree;
        String joe = "Joe's Gourmet Burgers";
        String main = "Main street Pizza Company";
        String corner = "Corner Cafe";
        String mama = "Mama's Fine Italian";
        String chef = "the chef's kitchen";


        System.out.print("Is there anyone at the party that is vegetarian: ");
        Vegetarian = scanner.nextLine();
        System.out.print("Is there anyone at the party that is vegan: ");
        Vegan = scanner.nextLine();
        System.out.print("Is there anyone at the party that is Gluten-Free: ");
        GlutenFree = scanner.nextLine();

        System.out.println("Here are your restaurant choices: ");

        if (Vegetarian.equalsIgnoreCase("no") && Vegan.equalsIgnoreCase("no") && GlutenFree.equalsIgnoreCase("no")){
            System.out.println("\tJoe's gourmet Burger");
        }
        if (Vegetarian.equalsIgnoreCase("yes") && Vegan.equalsIgnoreCase("no") && GlutenFree.equalsIgnoreCase("yes")){
            System.out.println("\tMain's Street Pizza Company");
        }
        if (Vegetarian.equalsIgnoreCase("yes") && Vegan.equalsIgnoreCase("yes") && GlutenFree.equalsIgnoreCase("yes")) {
            System.out.println("\tCorner Cafe");
        } else if (Vegetarian.equalsIgnoreCase("yes") && GlutenFree.equalsIgnoreCase("yes"))
            System.out.println("\tCorner Cafe");
        if (Vegetarian.equalsIgnoreCase("yes") && Vegan.equalsIgnoreCase("no") && GlutenFree.equalsIgnoreCase("no")) {
            System.out.println("\tMama's Fine Italian");
        }
        if (Vegetarian.equalsIgnoreCase("yes") && Vegan.equalsIgnoreCase("no")){
            System.out.println("\tThe Chef's Kitchen");
        }

    }
}
