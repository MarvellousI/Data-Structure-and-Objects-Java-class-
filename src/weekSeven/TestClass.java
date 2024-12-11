package weekSeven;

public class TestClass {
    //main method
    public static void main(String[] args){
        String name = "Marvellous";
        String names [] = {"Marvellous", "Kamai", "Simi"};

        //create an instance of my student class
        Student student1 = new Student("Marvellous",123456, "Information Tech");
        Student student2 = new Student();
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
