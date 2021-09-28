/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Cuza
 */
package ex31;

import java.util.*;

public class HeartRate {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double rate;
        try {
            System.out.print("Enter your Age : ");
            int age = s.nextInt();

            System.out.print("Enter your resting heart rate : ");
            double heartRate = s.nextFloat();

            System.out.println("Resting Pulse : " + (int)heartRate + "      Age : " + age);

            System.out.println("Intensity   | Rate");

            System.out.println("------------|----------");

            for (int i = 55; i <= 95; i += 5)
            {
                rate = (((220 - age) - heartRate) * i/100) + heartRate;

                System.out.println(i + "%" + "         | " + Math.round(rate) + " bpm");
            }
        }
        catch(Exception e)
        {
            System.out.println("Enter only numbers...");
        }
    }
}