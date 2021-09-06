package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */
import java.util.Scanner;
public class PrintingQuotes
{
    public static void main( String[] args )
    {
        System.out.print("What is the quote? "); //asks user for quote
        Scanner input= new Scanner(System.in); //imports scanner
        String quote = input.nextLine(); //scans users response
        System.out.print("Who said it? "); //asks for author
        String author = input.nextLine(); //scans users response
        System.out.println(author+" says, "+"\"" +quote+ "\"" ); //prints scanned responses while putting the quote in quotation marks
    }
}
