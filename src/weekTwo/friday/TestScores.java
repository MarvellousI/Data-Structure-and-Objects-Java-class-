package weekTwo.friday;

import java.util.Scanner;

public class TestScores
{
    public static void main(String args [])
    {
        //prompt userto enter in the number of book purchased

        //using scanner
        Scanner scn = new Scanner(System.in);

        //display a message
        System.out.println("Enter test score");

        //input
        //Declare my variable
        int TestScore;
        char LetterGrade;
        TestScore = Integer.parseInt(scn.nextLine());

        //if (){} --> syntax
        if (TestScore >= 90){
            LetterGrade = 'A';
        }
        else if(TestScore >= 80){
            LetterGrade = 'B';
        }
        else if(TestScore >= 70){
            LetterGrade = 'C';
        }
        else if (TestScore >= 60){
            LetterGrade = 'D';
        }
        else {
            LetterGrade = 'F';
            System.out.println("F");
        }
        //display results
        //soutf --> System,out,printf("")
        System.out.printf("The Test Score is : %d \n" ,TestScore);
        System.out.printf("The Letter Grade is : %c" ,LetterGrade);

        //closing scanner object
        scn.close();
    }
}

