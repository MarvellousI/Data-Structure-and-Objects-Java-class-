package weeekEight.packageDemo;

public class PersonTest {
    public static void main(String[] args){
        //Instantiate the Person object
        Person personOne = new Person("Marvellous","Imo", 18, "131 W State",100000.00 );
        Person personTwo = new Person("Rita","Majiy", 19, "176 fifth Ave",98000.00);

        //display original information.
        personOne.displayPersonContent();
        personTwo.displayPersonContent();

        //update the public instance field/variables
        personOne.lastNames ="ImoA";
        personTwo.lastNames ="MajiyA";

        //set new values to the private instant field/variable
       // System.out.println("\nUpdated info:");
        personOne.setAge(19);
        personTwo.setSalary(100000.00);

        //Try to access displayAge() method with a access modifier as private
        //comment out the code that does not work
        //personOne.displayAge();
        System.out.println("\nUpdated info:");
        personOne.displayAddress();
        personOne.displaySalary();

        //Display updated information.
        //personOne.displayPersonContent();
        //personTwo.displayPersonContent();

    }

}
