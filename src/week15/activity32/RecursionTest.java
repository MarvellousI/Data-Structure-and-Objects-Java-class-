package week15.activity32;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion count = new Recursion(); // Create Recursion instance
        // Test countDown() method
        count.countDown(10); // Start countdown from 10

        // Test alphaBackwards() method
        Recursion letter = new Recursion();
        letter.alphaBackwards('r'); // Start with letter 'z'
    }
}

