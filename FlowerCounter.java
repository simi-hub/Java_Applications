//Program written by Mosinmiloluwa Ojeyomi (Simi)
//Created on July 21, 2021,
//This program allows user to compute the cost of flowers sold at a flower stand.

import java.util.Scanner;
public class FlowerCounter
{
    public static void main(String[] args)
    {
        String flowerType;
        int quantity;
        double totalCost;

        String[]flowerArray = new String[]{"Petunia", "Pansy", "Rose", "Violet", "Carnation"};
        double[]costArray = new double[]{0.50, 0.75, 1.50, 0.50, 0.80};

        System.out.println("Hello, welcome to Yamanaka flower shop");
        System.out.println("Please enter the name of the flower you would like to purchase");
        Scanner inputFlower= new Scanner(System.in);
        flowerType = inputFlower.next();

        System.out.println("Please enter the quantity you would like to purchase");
        Scanner inputQuantity= new Scanner(System.in);
        quantity = inputQuantity.nextInt();

        String searchForFlower = "";//variable to hold flower type after finding in flower array


        boolean found = false;
        int i = 0;// variable to hold index of element to search in the array(index)
        while (!found && i < flowerArray.length)
        {
            if (flowerArray[i].equals(flowerType))//loops through array to see if input from user is part of array
            {
                found = true;
                searchForFlower= flowerArray[i];//finds input in array, and stores it in searchForFlower
            }
            else
                i++;//if input is not part of array, keeps searching the array
        }

        totalCost=(quantity*costArray[i]);//could also use searchCostArray in place of costArray[i],-- line 37

        System.out.println("The estimated cost per unit of a "+searchForFlower+" "+"is"
                +" "+costArray[i]+"$");
        System.out.println("You requested"+" "+quantity+" "+"units.\nTherefore,");
        System.out.println("The total cost is"+" "+ totalCost+"$");
    }
}
