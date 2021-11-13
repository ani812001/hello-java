package com.ank;

import java.util.Scanner;

public class codingchallange1 {
    public static void main(String[] args)
    {
        /****     Codingchallenge    ****/

        // write a java program that allow the user
        // to enter his weight and height, and display
        // the body mass indexx for this user.

        //The formula is BMI = kg/m2 where kg is a person's
        // weight in kilograms and m2 iss their height
        // in eter squared.


        System.out.println("Please Enter your Weight in kiograms");
        //Get tha values from users
        Scanner scanner = new Scanner(System.in);

        float w = scanner.nextFloat();

        System.out.println("Please Enter your Height in meters");
        float h = scanner.nextFloat();



        float bmi = w/(h*h);

        System.out.println("BMI = " +bmi);



    }
}
