package ArrayListDemo;
import java.util.ArrayList;
public class SystemManagement {
    private ArrayList<Integer> scores = new ArrayList<>();
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<Double> gpas = new ArrayList<>();

    // Add items
    public void addCourse(String course) {
        courses.add(course);
    }

    public void addGPA(double gpa) {
        gpas.add(gpa);
    }

    public void addScore(int score) {
        scores.add(score);
    }

    // Remove items
    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void removeGPA(double gpa) {
        gpas.remove(gpa);
    }

    public void removeScore(int score) {
        scores.remove(Integer.valueOf(score));
    }

    // Get size
    public int getCoursesSize() {
        return courses.size();
    }

    public int getGpasSize() {
        return gpas.size();
    }

    public int getScoresSize() {
        return scores.size();
    }

    // Get element by index
    public String getCourse(int index) {
        return courses.get(index);
    }

    public double getGPA(int index) {
        return gpas.get(index);
    }

    public int getScore(int index) {
        return scores.get(index);
    }

    // Display elements
    public void displayCourses() {
        System.out.println("Courses:");
        for (String course : courses) {
            System.out.println(course);
        }

        System.out.println("Using regular for loop:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
    }

    public void displayGPAs() {
        System.out.println("GPAs:");
        for (double gpa : gpas) {
            System.out.println(gpa);
        }

        System.out.println("Using regular for loop:");
        for (int i = 0; i < gpas.size(); i++) {
            System.out.println(gpas.get(i));
        }
    }

    public void displayScores() {
        System.out.println("Scores:");
        for (int score : scores) {
            System.out.println(score);
        }

        System.out.println("Using regular for loop:");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i));
        }
    }
}


