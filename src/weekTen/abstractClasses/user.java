package weekTen.abstractClasses;

public abstract class user {
    protected String name;
    protected int contactNumber;
    protected String email;
    protected String password;


    //default constructor
    public user(){

    }

    public user(String name, int contactNumber, String email, String password) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.password = password;
    }

    //setters and getters
    public String getName (){
        return name = name;
    }
    public void setName(){
        this.name = name;
    }

    public abstract void displayDetails();

}
