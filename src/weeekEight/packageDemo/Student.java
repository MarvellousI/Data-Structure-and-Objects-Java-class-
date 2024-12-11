package weeekEight.packageDemo;

public class Student {
    //Define the Instance field/variable
    //5
    private String studentName;
    private String major;
    private int studentId;
    private int year;
    private double gpa;

    //constructor
    public Student(String Studentname, String Major, int StudentId,int Year, double GPA) {
        this.studentName = Studentname;
        this.major = Major;
        this.studentId = StudentId;
        this.year = Year;
        this.gpa = GPA;
    }
    //setters (mutators)
    public void setStudentName(String Studentname){
        this.studentName = Studentname;
    }
    public void setMajor(String Major){
        this.major = Major;
    }
    public void setStudentId(int StudentId){
        this.studentId = StudentId;
    }
    public void setYear(int Year){
        this.year = Year;
    }
    public void setGpa(double GPA){
        this.gpa = GPA;
    }

    //getter(Accessors)
    public String getStudentName(){
        return studentName;
    }
    public String getMajor(){
        return major;
    }
    public int getStudentId(){
        return studentId;
    }
    public int getYear(){
        return year;
    }
    public double getGpa(){
        return gpa;
    }

}
