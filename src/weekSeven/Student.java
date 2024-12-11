package weekSeven;

public class Student {
    //member variable also called Field
    //instance variable

    //States: representing the data and values
    String studentName;
    int studentID;
    String major;

    //constructor
    //has to have public NameofYourClass()
    //Default constructor
    public Student() {
        this.studentName ="No Name";
        this.major = "Not decided";
        this.studentID = 0000;
    }
    public Student(String Name, int SID, String Major){
        this.studentName = Name;
        this.studentID = SID;
        this.major = Major;

    }
    //behaviour
    //Method
    public void displayStudentInfo(){
        System.out.printf("The name of the Student is: %s\nStudent ID: %d\nStudent Major: %s\n", this.studentName, this.studentID, this.major);
    }

}
