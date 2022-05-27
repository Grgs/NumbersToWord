package com.genspark;

import java.util.ArrayList;

/**
 * An app for converting numbers to words.
 */
public class App {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        NumbersToWords numbersToWords = new NumbersToWords();
        System.out.println("Enter a number: ");
//        numbersToWords.setNumberString(scanner.nextLine().strip());
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("-1");
        numbers.add("-2");
        numbers.add("-10");
        numbers.add("-12");
        numbers.add("-68");
        numbers.add("-100");
        numbers.add("0");
        numbers.add("-0");
        numbers.add("1");
        numbers.add("2");
        numbers.add("10");
        numbers.add("12");
        numbers.add("68");
        numbers.add("535");
        numbers.add("1000");
        numbers.add("8000");
        numbers.add("90000");
        numbers.add("500000");
        numbers.add("990000");
        numbers.add("1234567");
        numbers.add("12345678");
        numbers.add("123456789");
        numbers.add("123456789012");

        for (String number : numbers) {
            numbersToWords.setNumberString(number);
            System.out.printf("%s is: %s%n", number, numbersToWords.getWords());
        }
    }
}
