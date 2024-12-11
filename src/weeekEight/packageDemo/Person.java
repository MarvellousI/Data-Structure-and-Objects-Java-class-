package weeekEight.packageDemo;

public class Person {
    //Two public instance fields/variables

    public String firstNames;
    public String lastNames;

    //Three private instance fields/variable
    private int age;
    private String address;
    private double salary;

    //Constructor: Parameter constructor
    //Takes in 5 parameters.
    public Person(String FirstName, String LastName, int Age, String Address, double Salary){
        this.firstNames = FirstName;
        this.lastNames = LastName;
        this.age = Age;
        this.address = Address;
        this.salary = Salary;
    }
    //Access modifier: Public
    public void displayPersonContent(){
        System.out.printf("\nFull Name: %s %s\nAge: %d\nAddress: %s\nSalary: %.2f\n", firstNames, lastNames, age, address, salary);
    }
    //Access modifier: Private
    private void displayAge(){
        System.out.println("Age" + age);
    }
    //Access Modifier: Proctected
    //Protected: means can only be acessed inside of the class,
    //        any class that is inside of its package, and any of the class's subclass
    protected void displayAddress(){
        System.out.println("\nAddress: " + address);
    }
    //Access Modifier: default
    //Default: means access has no keyword and
    //         alllowed to access within the package the class is in.
    //           "Package.Private == default"
    void displaySalary(){
        System.out.println("Salary: " + salary);
    }
    // OPP Concept: #1 Encapsulation
    //SETTER(Mutators) AND GETTER(Accessors)
    /*
          private int age;
          private String address;
          private double salary;
     */
    //Setters(Mutators)
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    //Getters(Accessors)
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public double getSalary(){
        return salary;
    }

}
