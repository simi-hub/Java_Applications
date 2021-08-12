//Program written by Mosinmiloluwa Ojeyomi (Simi)
//Created on August 3, 2021,
//Test class for Counter.java

public class CounterTest
{
    public static void main(String[] args)
    {
        Counter ct = new Counter();
        ct.printCount();

        //increases count
        System.out.print("When increased by 1, ");
        ct.increaseCount();
        ct.printCount();
        System.out.print("When increased by 3, ");
        ct.increaseCount();
        ct.increaseCount();
        ct.increaseCount();
        ct.printCount();

        // decreases count
        System.out.print("When decreased by 1, ");
        ct.decreaseCount();
        ct.printCount();
        System.out.print("When decreased by 2, ");
        ct.decreaseCount();
        ct.decreaseCount();
        ct.printCount();

        //resets the count to 0
        System.out.print("After count reset, ");
        ct.setCounter();
        ct.printCount();

        //Test for negative value of count
        ct.decreaseCount();
        ct.printCount();

        System.out.println(ct.getCount());//going to be negative because count is negative

    }
}
