package com.genspark;

import com.genspark.NumbersToWords.NumbersToWords;
import com.genspark.NumbersToWords.WesternNumbersToWords;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Scanner;

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

    public static void testing(NumbersToWords numbersToWords) {
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
        numbers.add("100");
        numbers.add("101");
        numbers.add("110");
        numbers.add("111");
        numbers.add("535");
        numbers.add("1,000");
        numbers.add("1000");
        numbers.add("1001");
        numbers.add("1010");
        numbers.add("1011");
        numbers.add("1100");
        numbers.add("1101");
        numbers.add("1110");
        numbers.add("1111");
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

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        NumbersToWords numbersToWords = context.getBean(WesternNumbersToWords.class);
//        runOnConsole(numbersToWords);
        testing(numbersToWords);
    }

    private static void runOnConsole(NumbersToWords numbersToWords) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = scanner.nextLine();
        numbersToWords.setNumberString(number);
        System.out.printf("%s is: %s%n", number, numbersToWords.getWords());
    }
}
