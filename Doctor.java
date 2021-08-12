/*
 * Program written by Mosinmiloluwa Ojeyomi (Simi)
 * Created on August 8, 2021,
 * This class is a derived class from Person.java
 * Copyright (c) 2021.
 * All rights reserved
 */

import java.util.Scanner;

public class Doctor extends Person
{
    private String doctorName;
    private double officeFee;
    private String doctorSpecialty;

    Doctor() //creating constructor for derived class
    {
        super();// calls parent or base class constructor
        officeFee = 0; //no amount for office fee yet
        doctorName=" ";//no doctor's name yet
        doctorSpecialty=" ";//no doctor specialty yet
    }
    Doctor(String initialName,String initialDoctorName,double initialOfficeFee,String initialDoctorSpecialty)
    {
        super(initialName);
        doctorName = initialDoctorName;
        officeFee =initialOfficeFee;
        doctorSpecialty=initialDoctorSpecialty;
    }
    public String getDoctorField()
    {
        return doctorSpecialty;
    }
    public double getConsultationFee()
    {
        return officeFee;
    }
    public String getDoctorName() //accessor method
    {
        return doctorName;
    }
    public void setDoctorName(String newDoctorName) //mutator method
    {
        doctorName = newDoctorName;
    }
    public void setDoctorField(String newDoctorSpecialty) //mutator method
    {
        doctorSpecialty = newDoctorSpecialty;
    }
    public void setConsultationFee(double newOfficeFee) //mutator method
    {
        officeFee = newOfficeFee;
    }
    public void writeOutput()
    {
        System.out.println("Doctor's Name: Doctor " + doctorName);
        System.out.println("Consultation fee: $" + officeFee);
        System.out.println("Doctor's Specialty: " + doctorSpecialty);
    }
    public String toString()//overriding the toString method
    {
        return "Doctor's name = "+" "+doctorName+" "+"and visitation fee is"+" "+officeFee;
    }

    public static void main(String[] args)
    {
        Doctor dc = new Doctor("James Bond","Jones",5.00,
                                "Neurosurgeon");
        dc.writeOutput();//test for write output

        System.out.println("Enter new name of the doctor. You only need to include the name, do not include doctor");
        Scanner input = new Scanner(System.in);
        String inputDocName = input.next();

        dc.setDoctorName(inputDocName);//test for mutator method
        dc.writeOutput();

        System.out.println("What kind of doctor is"+" "+inputDocName);
        Scanner input1 = new Scanner(System.in);
        String specialty = input1.next();

        dc.setDoctorField(specialty);//test to change doctorField
        dc.writeOutput();

        System.out.println("Enter new rate for office fee");
        Scanner input2 = new Scanner(System.in);
        double docMoney= input2.nextInt();

        dc.setConsultationFee(docMoney);//test to change consultation fee
        dc.writeOutput();

        System.out.println(" ");
        System.out.println("New data is as follows");

        //test for accessor methods
        System.out.println(" ");
        System.out.println("Doctor's Name: "+dc.getDoctorName()+
                            "\nDoctor's Specialty: "+dc.getDoctorField()+
                            "\nDoctor's rate: "+dc.getConsultationFee());
    }
}
