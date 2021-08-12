/*
Program written by Mosinmiloluwa Ojeyomi (Simi)
Created on August 8, 2021,
This code below is not mine and was gotten from the textbook below in order to solve another problem
Java:  An Introduction To Problem-Solving And Programming, by Walter Savitch-Eighth Edition.  Pearson, 2018.
Copyright (c) 2021.
 */

public class Person
{  private String name;

    public Person( )
    {
        name = "No name yet";
    }
    public Person(String initialName)
    {
        name = initialName;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public String getName( )
    {
        return name;
    }
    public void writeOutput( )
    {
        System.out.println("Name: " + name);
    }
    public boolean hasSameName(Person otherPerson)
    {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}