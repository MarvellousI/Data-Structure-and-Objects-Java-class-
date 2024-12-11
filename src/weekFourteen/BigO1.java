package weekFourteen;

public class BigO1 {
    public static void main(String[] args) {
        //Big O
        //What Big O is
        //Describe the performance or complexity of an algorithm
        //What is the maximum amount of time or space that my algorithm takes
        //Time Complexity - the time it takes to run as function of the size of the input data
        //Space Complexity - the space it requires
        printOneTime("Marvellous");

        //array of students (20)
        String[] students = {"Marvellous", "Rita", "Zoey", "Aaron", "Halle",
                "Billy", "Doug", "Vivek", "Jay", "Jack", "Sonia", "Josh", "Kia",
                "Rita", "Bailey", "Sky","Joshua", "Peter", "Paul", "Anna"};

        //20 Student -> maximum of 5 comparison
        int index = binarySearch(students, "Jay");//looking for Jay
        if(index != -1){
            System.out.println("Jay is found at index" + index);
        }else {
            System.out.println("Jay is not found in this array");
        }
        //call linear method
        printNTimes(students);
    }
    //0(1) - constant time --> doesn't change based off of increasing input
    public static void printOneTime(String name) {
        System.out.println(name);
    }
    public static void printNTimes(String[] array) {
        for(String name: array){
            System.out.println(name);
        }
    }
    //0(log n) - Logarithmic time - the execution time grow logarithmically with the input data
    public static int binarySearch(String[] array, String value) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = value.compareTo(array[mid]);

            if (result == 0) {
                return mid; //value found
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; //value not found
    }
}
