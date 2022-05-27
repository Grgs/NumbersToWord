package com.genspark;

import java.util.ArrayList;

/**
 * An app for converting numbers to words.
 */
public class App {
    private static void printNumbers(NumbersToWords numbersToWords, ArrayList<String> numbers) {
        for (String number : numbers) {
            numbersToWords.setNumberString(number);
            System.out.printf("%s is: %s%n", number, numbersToWords.getWords());
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        NumbersToWords numbersToWords = new NumbersToWords();
//        System.out.println("Enter a number: ");
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
        numbers.add("40");
        numbers.add("49");
        numbers.add("68");
        numbers.add("+88");
        numbers.add("535");
        numbers.add("1,000");
        numbers.add("8000");
        numbers.add("900,00");
        numbers.add("500000");
        numbers.add("990000");
        numbers.add("1234567");
        numbers.add("12,345,678");
        numbers.add("234567895");
        numbers.add("723456789012");
        numbers.add("823456789012099");
        numbers.add("8234567890120991");
        numbers.add("8234567890120991234456789012099");

        printNumbers(numbersToWords, numbers);
    }
}
