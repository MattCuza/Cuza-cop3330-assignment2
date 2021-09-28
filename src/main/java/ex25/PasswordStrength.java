/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Cuza
 */
package ex25;

import java.util.*;

public class PasswordStrength {

    public static void PasswordValidator(String input)
    {

        int n = input.length();
        boolean lowerCase = false, upperCase = false;
        boolean digits = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));

        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                lowerCase = true;
            if (Character.isUpperCase(i))
                upperCase = true;
            if (Character.isDigit(i))
                digits = true;
            if (set.contains(i))
                specialChar = true;
        }

        if (digits && lowerCase || upperCase && specialChar
                && (n >= 8))
            System.out.println("The password '" + input + "' is a very strong password");
        else if ((lowerCase || upperCase || specialChar)
                && (n >= 8))
            System.out.println("The password '" + input + "' is a strong password");
        else if(lowerCase || upperCase && (n < 8))
            System.out.print("The password '" + input + "' is a weak password");
        else
            System.out.print("The password '" + input + "' is a very weak password");

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Password: ");
        String input=sc.nextLine();

        PasswordValidator(input);
    }
}