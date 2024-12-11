package weekThirteen.Lab12;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue; import java.util.Stack;
public class DataStructure <T> {

    //Array - Generalized to T
    private int[] agelist = new int[3]; // students'|ages
    private int ageIndex = 0;
    private ArrayList<String> studentList = new ArrayList<>(); // students' names
    private HashMap<String, Double> majorGpaMap = new HashMap<>(); // keys: majors,values: gpas
    private LinkedList<String> nationalityList = new LinkedList<>(); // students' nationalities
    private Stack<String> hometownStack = new Stack<>();// students' hometowns
    private Queue<String> homeStateQueue = new LinkedList<>();//

    // add-an-element method for all data structures
    //Array - Student age
    public void addAge (int age){
        if (ageIndex < agelist.length){
            agelist[ageIndex ++] = age;
        }
    }
    public void addStudent (String name) {
        studentList.add (name);
    }
    // Add major and GPA
    public void addMajorGpa(String major, double gpa) {
        majorGpaMap.put(major, gpa);
    }

    // Add nationality (LinkedList)
    public void addNationality(String nationality) {
        nationalityList.add(nationality);
    }

    // Add hometown (Stack)
    public void addHometown(String hometown) {
        hometownStack.push(hometown);
    }

    // Add home state (Queue)
    public void addHomeState(String state) {
        homeStateQueue.offer(state);
    }
    // remove-an-element method for all data structures
    //.....
    //array- remove age
    public void removeAge() {
        if(ageIndex > 0){
            agelist[-- ageIndex] = 0;
        }
    }
    public void removeStudent(String name) {
        studentList.remove(name);
    }

    // Remove a major and GPA (HashMap)
    public void removeMajorGpa(String major) {
        majorGpaMap.remove(major);
    }

    // Remove a nationality (LinkedList)
    public void removeNationality(String nationality) {
        nationalityList.remove(nationality);
    }

    // Remove a hometown (Stack)
    public void removeHometown() {
        if (!hometownStack.isEmpty()) {
            hometownStack.pop();
        } else {
            System.out.println("No hometowns to remove.");
        }
    }

    // Remove a home state (Queue)
    public void removeHomeState() {
        if (!homeStateQueue.isEmpty()) {
            homeStateQueue.poll();
        } else {
            System.out.println("No home states to remove.");
        }
    }
    //...
    //print-all-elements method for all data structures
    //array- student ages
    public void printArrayItems(){
        for (int i = 0; i < agelist.length; i++) {
            System.out.println("\n Arrays: ");
            System.out.printf("\nThe Content in the array: \n\t%d\n", agelist[i]);
        }
    }
    // Print student names
    public void printStudentList() {
        System.out.println("List of students:");
        for (String name : studentList) {
            System.out.println(name);
        }
    }

    // Print majors and their GPAs
    public void printMajorGpaMap() {
        System.out.println("Major and GPA map:");
        for (String major : majorGpaMap.keySet()) {
            System.out.printf("%s: %.2f\n", major, majorGpaMap.get(major));
        }
    }

    // Print nationalities
    public void printNationalityList() {
        System.out.println("List of nationalities:");
        for (String nationality : nationalityList) {
            System.out.println(nationality);
        }
    }

    // Print hometowns
    public void printHometownStack() {
        System.out.println("Stack of hometowns:");
        for (String hometown : hometownStack) {
            System.out.println(hometown);
        }
    }
    // Print all home states in the Queue (from front to back)
    public void printHomeStateQueue() {
        System.out.println("Queue of home states:");
        for (String state : homeStateQueue) {
            System.out.println(state);
        }
    }
}
