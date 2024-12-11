package weekThirteen.Lab12;

public class Main {
    public static void main(String[] args){
        //create instance
        DataStructure DS = new DataStructure();

        //add items(age)
        DS.addAge(20);
        DS.addAge(12);
        DS.addAge(45);
        DS.addAge(34);

        //add items(Student names)
        DS.addStudent("Marvellous");
        DS.addStudent("Lexi");
        DS.addStudent("Sophie");
        DS.addStudent("Maya");

        //add items (major and GPA)
        DS.addMajorGpa("Computer Tech", 4.0);
        DS.addMajorGpa("Elementary Education", 3.5);
        DS.addMajorGpa("Biology", 3.4);
        DS.addMajorGpa("Dance", 3.8);

        //add items (Nationality)
        DS.addNationality("Nigeria");
        DS.addNationality("American");
        DS.addNationality("Canadian");
        DS.addNationality("Mexican");

        //add items (hometowns)
        DS.addHometown("Abuja");
        DS.addHometown("New York");
        DS.addHometown("Toronto");
        DS.addHometown("Jalisco");

        //add items (home state)
        DS.addHomeState("Lagos");
        DS.addHomeState("Texas");
        DS.addHomeState("Quebec");
        DS.addHomeState("Mexico City");

        // Display items
        System.out.println("\n***** Before Removing Items *****");
        DS.printArrayItems();
        DS.printStudentList();
        DS.printMajorGpaMap();
        DS.printNationalityList();
        DS.printHometownStack();
        DS.printHomeStateQueue();


        //remove
        DS.removeAge();
        DS.removeStudent("Maya");
        DS.removeMajorGpa("Computer Tech");
        DS.removeNationality("American");
        DS.removeHometown();
        DS.removeHomeState();


        // Print items after removal
        System.out.println("\n****After Removing One Item****");
        DS.printArrayItems();
        DS.printStudentList();
        DS.printMajorGpaMap();
        DS.printNationalityList();
        DS.printHometownStack();
        DS.printHomeStateQueue();
    }
}
