package weekSeven;

public class chefs {
    //member variable also called Field
    //instance variable

    //States: representing the data and values
    String chefName;
    int chefRank;
    String favoriteDish;

    //constructor
    //has to have public NameofYourClass()
    //Default constructor
    public chefs() {
        this.chefName ="No Name";
        this.favoriteDish = "Not decided";
        this.chefRank = 0000;
        }
        public chefs(String Name, int Rank, String Dish){
        this.chefName = Name;
        this.chefRank = Rank;
        this.favoriteDish= Dish;

        }
        //behaviour
        //Method
        public void displayChefInfo(){
        System.out.printf("The name of the chef is: %s\nChef Rank is: %d\nChef favorite food is: %s\n", this.chefName, this.chefRank, this.favoriteDish);
        }

    }

