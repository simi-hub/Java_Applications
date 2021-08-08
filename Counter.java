//Program written by Mosinmiloluwa Ojeyomi (Simi)
//Created on August 1, 2021,
//This program allows user count things, so it records a count that is a non-negative whole number.


public class Counter
{
    private  int count;

    Counter()//constructor. This set count to 0, initializes the instance variable
    {
        count = 0;
    }

    public int increaseCount()// This method increases count by 1
    {
        return count++;
    }

    public  int decreaseCount()//This method decreases count by 1
    {
        if (count < 0)//make sure that count is not negative
        {
            System.out.println("The current count is negative, out of bounds");
        }
        return count--;
    }
    public int setCounter()//This method resets the count to 0, mutator method
    {
        count = 0;
        return count;
    }

    public int getCount()//This method gets the count, accessor method
    {
        return count;
    }

    public  void printCount()// This method prints count for user to see
    {
        if (count < 0)//make sure that count is not negative
        {
            System.out.println("The current count is negative, out of bounds");
        }
        else
        System.out.println("The current count is "+count);
    }

}

