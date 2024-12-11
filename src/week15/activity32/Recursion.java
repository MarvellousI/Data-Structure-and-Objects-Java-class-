package week15.activity32;

public class Recursion {
    // Recursive method to count down and print "Blast Off!"
    public void countDown(int number) {
        if (number == 0) { // Base case:
            System.out.println("Blast Off!");
        } else {
            System.out.print(number + "...."); // Print the current number
            countDown(number - 1); // Recursive call with number - 1
        }
    }

    // Recursive method to print letters backwards
    public void alphaBackwards(char letter) {
        if (letter == 'a') { // Base case: letter is 'a'
            System.out.println(letter);
        } else {
            System.out.print(letter + "...."); // Print the current letter
            alphaBackwards((char) (letter - 1)); // Recursive call with letter - 1
        }
    }
}
