/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Cuza
 */
package ex28;

import java.util.*;

public class AddingNum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            total += in.nextInt();
        }
        System.out.println("The total is " + total + ".");
    }
}