package com.genspark;

import java.util.Scanner;

/**
 * An app for converting numbers to words.
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        NumbersToWords numbersToWords = new NumbersToWords();
        System.out.println("Enter a number: ");
        numbersToWords.setNumberString(scanner.nextLine().strip());
        System.out.println("The answer is:" + numbersToWords.getWords());
    }
}
