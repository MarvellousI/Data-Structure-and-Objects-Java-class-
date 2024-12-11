package weekFourteen.Activity28;

import java.util.*;

public class DataStructure<T> {
    // Array - Generalized to T
    private T[] agelist; // Can store any type of data (e.g., ages, scores, etc.)
    private int ageIndex = 0; //add elements to agelist
    private ArrayList<T> studentList = new ArrayList<>(); // A list for students
    private HashMap<String, T> majorGpaMap = new HashMap<>(); // Map for major GPA
    private LinkedList<T> nationalityList = new LinkedList<>(); // LinkedList for nationalities
    private Stack<T> hometownStack = new Stack<>(); // Stack to store hometowns
    private Queue<T> homeStateQueue = new LinkedList<>(); // Queue to store home states

    //initialize the agelist with a specific size
    public DataStructure(T size) {
        agelist = (T[]) new Object [(int) size]; // Create a generic array
    }

    // Add an element method for all data structures
    public void addAge(T age) {
        if (ageIndex < agelist.length) {
            agelist[ageIndex++] = age; // Add generic type to array
        }
    }

    public void addStudent(T student) {
        studentList.add(student); // Add student
    }

    public void addMajorGpa(String major, T gpa) {
        majorGpaMap.put(major, gpa); // Add major and GPA
    }

    public void addNationality(T nationality) {
        nationalityList.add(nationality); // Add nationality
    }

    public void addHometown(T hometown) {
        hometownStack.push(hometown); // Push hometown (stack)
    }

    public void addHomeState(T state) {
        homeStateQueue.offer(state); // Offer state to the queue
    }

    // Remove an element method for all data structures
    public void removeAge() {
        if (ageIndex > 0) {
            agelist[--ageIndex] = null; // Remove element by setting it to null for generics
        }
    }

    public void removeStudent(T student) {
        studentList.remove(student); // Remove student
    }

    public void removeMajorGpa(String major) {
        majorGpaMap.remove(major); // Remove major and its GPA
    }

    public void removeNationality(T nationality) {
        nationalityList.remove(nationality); // Remove nationality from the list
    }

    public void removeHometown() {
        if (!hometownStack.isEmpty()) {
            hometownStack.pop(); // Pop a hometown from the stack
        } else {
            System.out.println("No hometowns to remove.");
        }
    }

    public void removeHomeState() {
        if (!homeStateQueue.isEmpty()) {
            homeStateQueue.poll(); // Poll a state from the queue
        } else {
            System.out.println("No home states to remove.");
        }
    }

    // Print all elements method for all data structures
    public void printArrayItems() {
        System.out.println("\nArray of Items: ");
        for (T item : agelist) {
            System.out.println(item); // Print each item in the array
        }
    }

    // Print student list
    public void printStudentList() {
        System.out.println("List of students:");
        for (T student : studentList) {
            System.out.println(student); // Print each student
        }
    }

    // Print majors and their GPAs
    public void printMajorGpaMap() {
        System.out.println("Major and GPA map:");
        for (String major : majorGpaMap.keySet()) {
            System.out.printf("%s: %s\n", major, majorGpaMap.get(major)); // Print each major and GPA
        }
    }

    // Print nationalities
    public void printNationalityList() {
        System.out.println("List of nationalities:");
        for (T nationality : nationalityList) {
            System.out.println(nationality); // Print each nationality
        }
    }

    // Print hometown stack
    public void printHometownStack() {
        System.out.println("Stack of hometowns:");
        for (T hometown : hometownStack) {
            System.out.println(hometown); // Print each hometown
        }
    }

    // Print home states in the queue
    public void printHomeStateQueue() {
        System.out.println("Queue of home states:");
        for (T state : homeStateQueue) {
            System.out.println(state); // Print each state
        }
    }
}
