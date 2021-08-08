//Program written by Mosinmiloluwa Ojeyomi (Simi)
//Created on July 12, 2021,
//This program allows a user to enter any number of student test

import java.util.Scanner;

public class studentTestScores
{
    public static void main(String[] args)
    {

        int studentScores;
        int highestScore;
        int lowestScore;
        int averageScore;
        int sum=0;
        int count=0; // keeps track of number of scores entered


        System.out.println("Please enter the numbers for the student test scores");
        System.out.println("After entering all scores, enter -1");

        Scanner keyboard = new Scanner(System.in);
        studentScores = keyboard.nextInt();

        highestScore=studentScores;
        lowestScore=studentScores;

        while(studentScores>0)
        {

            if (studentScores>100)//Do not use input when score is greater than 100
            {
                System.out.println("Score is greater than 100. Cannot be used");

            }
            else
            {
                sum += studentScores;
                count++;

                if (studentScores > highestScore)
                {
                    highestScore = studentScores;
                }
                if (studentScores < lowestScore)
                {
                    lowestScore = studentScores;
                }
            }

            System.out.println("Please enter the numbers for the student test scores");
            System.out.println("After entering all scores, enter -1");
            studentScores = keyboard.nextInt();
        }

        averageScore = sum/count;
        System.out.println("The highest score entered is:"+" "+highestScore);
        System.out.println("The lowest score entered is: "+" "+lowestScore);
        System.out.println("You entered" + " " + count + " " + "scores");
        System.out.println("The sum of numbers is: " + sum);
        System.out.println("The average score is: " + averageScore);

    }

}