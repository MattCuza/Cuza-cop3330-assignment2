/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Cuza
 */
package ex34;

import java.util.*;

public class EmployeeListRemoval {

    public static void printNames(ArrayList<String> names) {
        System.out.println("There are "+names.size()+" employees: ");
        for(String emp:names) {
            System.out.println(emp);
        }
    }

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>(Arrays.asList("John Smith", "Jackie Jackson",
                "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));

        printNames(names);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an employee name to remove: ");
        String Removal = sc.nextLine();

        names.remove(Removal);

        printNames(names);
    }
}