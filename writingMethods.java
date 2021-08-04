//Program written by Mosinmiloluwa Ojeyomi (Simi)
//Created on July 29, 2021,
//This program contains methods that are written based on the questions, refer to writingMethods.md

import java.util.Scanner;

public class writingMethods
{
    public static int twice(int x)
    {
        int result;
        result = 2*x;// returns twice its integer argument
        return result;
    }
    public static boolean isBig(int x)
    {
        //This method returns true when x is greater than 10000
        return x > 10000;
    }
    public static void printResult(int x)
    {
        System.out.println(x);//This method prints out the value of x
    }
    public static int readCount()
    {
        Scanner input = new Scanner(System.in);// reads the integer
        return input.nextInt();//nextInt(); returns an integer
    }
    public static boolean inOrder(int x, int y)
    {
        return x < y; //returns true if first argument(x) is smaller than second argument
    }
    public static double inOrder1(double x, double y)
    {
        double sum;
        sum = (x+y);
        return sum; // returns sum of its two argument
    }
    public static void setDog()
    {
      Scanner keyboard = new Scanner(System.in);
        String dogName = keyboard.next();//reads name of dog
        Scanner keyboard1 = new Scanner(System.in);
        int dogAge = keyboard1.nextInt(); //reads age of dog
        System.out.println("Your dog's name is"+" "+dogName +" "+"and the age is"+" "+ dogAge);//writes name/age of dog
    }


    //unfortunately, for this method, I had to set the day to a specific day, it will always return Friday
    //I am not yet sure how to do it yet

    public static String nextDay()
    {
        String currentDay = "Thursday";
        String nextDay = "Friday";
        System.out.println(currentDay);
        return nextDay;
    }

    public static void main(String[] args)//main to test the methods
    {
        int x;
        int y;

        System.out.println("Please enter the value of x");
        Scanner input = new Scanner(System.in);
         x = input.nextInt();

        printResult(x);// prints the value of x, test for printResult
        System.out.println("Two times the value of x is: "+""+twice(x)+"\n");// returns 2x, test for twice

        System.out.println("This program prints true if x > 10000 and prints false otherwise");
        System.out.println(isBig(x)+"\n");// returns true when x is greater 10000, test for isBig

        System.out.println("Please enter any value and it will be returned on the next line");
        System.out.println(readCount());//reads input and return the integer on the next line

        System.out.println("Please enter the value of y");
        Scanner input1 = new Scanner(System.in);
        y = input1.nextInt();

        System.out.println("This program prints true if the x < y and false otherwise");
        System.out.println(inOrder(x,y));// prints true if x is less than y, test for inOrder

        System.out.println("The sum of x and y from the input above is:" + " "+inOrder1(x,y));//test for inOrder1

        System.out.println("Please enter the name and age of your dog if you have one");
        setDog();//test for setDog

        System.out.println("The current day will be displayed below and the following day after,");
        System.out.println("Tomorrow is"+" "+nextDay()+"!");

    }
}
