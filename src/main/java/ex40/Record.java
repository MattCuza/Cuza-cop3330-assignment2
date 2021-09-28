/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Cuza
 */
package ex40;

import java.util.Date;

public class Record {
    String firstName;
    String lastName;
    String position;
    Date separationDate;

    public Record(String firstName, String lastName,
                  String position, Date separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }
}
