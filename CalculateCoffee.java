//Program written by Mosinmiloluwa Ojeyomi (Simi)
//Created on June 29, 2021,
//This program calculates the number of coffee for a specific day

import java.util.Scanner;// import scanner class
public class CalculateCoffee
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);// create scanner object
        System.out.println("Please enter how many cups of coffee you drink everyday");//prompt
        int answer = keyboard.nextInt();//reads input
        int todayNumberofCoffee = answer - 1;// running target number of coffee
        System.out.println("The target number of cups of coffee for today is" + " " + todayNumberofCoffee);//displays result or output
    }
}