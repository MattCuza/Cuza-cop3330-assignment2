/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Cuza
 */
package ex40;

import java.util.*;

public class FilteringRecords {

    public static void main(String[] args) {
        Record[] records = {
                new Record("John", "Johnson", "Manager", new Date(2016, 12, 31)),
                new Record("Tou", "Xiong", "Software Engineer", new Date(2016, 10, 5)),
                new Record("Michaela", "Michaelson", "District Manager", new Date(2015, 12, 19)),
                new Record("Jake", "Jacobson", "Programmer", null),
                new Record("Jacquelyn", "Jockson", "DBA", null),
                new Record("Sally", "Webber", "Web Developer", new Date(2015, 12, 18))
        };
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a search string: ");
        String target = sc.nextLine();

        System.out.println("\nResults:\n");
        System.out.printf("%-20s | %-20s | %-20s\n", "Name", "Position", "Seperation Date");
        System.out.printf("%-21s|%-22s|%-21s\n", "--------------------", "---------------------", "--------------------");

        for(Record record : records) {
            String tmp;
            if(record.separationDate == null) tmp = "";
            else  tmp = record.separationDate.toString();
            if(record.firstName.contains(target) || record.lastName.contains(target))
                System.out.printf("%-20s | %-20s | %-20s\n",  record.firstName + " " +
                        record.lastName, record.position, tmp);
        }
    }
}
