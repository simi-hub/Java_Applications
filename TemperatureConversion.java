//Program written by Mosinmiloluwa Ojeyomi (Simi)
//Created on July 5, 2021,
//This program that converts degrees from Fahrenheit to Celsius


import java.util.Scanner;//import Scanner class
public class TemperatureConversion
{
    public static void main(String[] args)
    {
        double DegreesC; // DegreesC is degrees in Celsius
        System.out.println("This program that converts degrees from Fahrenheit to Celsius");
        System.out.println("Please enter temperature in degrees Fahrenheit as a whole number");// This prompts user to enter a value
        Scanner keyboard = new Scanner(System.in); //creates new object scanner
        int DegreesF = keyboard.nextInt();/* This creates variable of type int(DegreesF),reads the input from user
                                                    and stores it in DegreeF
                                                   */
        System.out.println("You entered"+ " " + DegreesF +" " + "F"); //This confirms user's input to be correct
        DegreesC = (double)(5 * (DegreesF - 32)) / 9; /* Formula that converts degrees from Fahrenheit to Celsius
                                                         Changes data type from int(DegreeF) to double(DegreesC)
                                                        */
        System.out.print(DegreesF + " "+ "degrees Fahrenheit is"); // outputs degree in Celsius in fractional part
        System.out.format("%.2f", DegreesC); // rounds up to 2 decimal place
        System.out.println("degrees Celsius");
    }
}
