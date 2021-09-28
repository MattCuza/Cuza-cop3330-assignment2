/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Cuza
 */
package ex29;

import java.util.*;

public class BadInput {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean condition = false;
        while(true)
        {
            try
            {
                System.out.print("What is the rate of return? ");
                int r=Integer.parseInt(sc.next());
                System.out.println("It will take "+(72/r)+" years to double your initial investment.");
                condition=true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if(condition)
            {
                break;
            }
        }
    }
}