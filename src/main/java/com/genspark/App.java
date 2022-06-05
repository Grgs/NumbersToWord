package com.genspark;

import com.genspark.NumbersMap.ModernNumbersMap;
import com.genspark.NumbersMap.TraditionalLongScaleBritishNumbersMap;
import com.genspark.NumbersMap.TraditionalLongScaleEuropeanNumbersMap;
import com.genspark.NumbersToWords.IndianNumbersToWords;
import com.genspark.NumbersToWords.NumbersToWords;
import com.genspark.NumbersToWords.WesternNumbersToWords;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Scanner;

/**
 * An app for converting numbers to words.
 *
 * @author Michael Guirguis
 */
public class App {

    /**
     * @param numbersToWords class that converts numbers to words.
     */
    private static void runOnConsole(NumbersToWords numbersToWords) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = scanner.nextLine();
        numbersToWords.setNumberString(number);
        System.out.printf("For current configuration %s is: %s%n", number, numbersToWords.getWords());
        WesternNumbersToWords westernNumbersToWords = new WesternNumbersToWords(new ModernNumbersMap());
        westernNumbersToWords.setNumberString(number);
        IndianNumbersToWords indianNumbersToWords = new IndianNumbersToWords();
        indianNumbersToWords.setNumberString(number);
        WesternNumbersToWords traditionalLongScaleEuropean =
                new WesternNumbersToWords(new TraditionalLongScaleEuropeanNumbersMap());
        traditionalLongScaleEuropean.setNumberString(number);
        WesternNumbersToWords traditionalLongScaleBritish =
                new WesternNumbersToWords(new TraditionalLongScaleBritishNumbersMap());
        traditionalLongScaleBritish.setNumberString(number);
        System.out.printf("   Western Modern number system: %s%n" +
                        "   Indian English number system: %s%n" +
                        "   Traditional European long scale number system: %s%n" +
                        "   Traditional British long scale number system: %s%n",
                westernNumbersToWords.getWords(),
                indianNumbersToWords.getWords(),
                traditionalLongScaleEuropean.getWords(),
                traditionalLongScaleBritish.getWords());
    }

    /**
     * Get input from user and run the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        NumbersToWords numbersToWords = context.getBean(NumbersToWords.class);
        runOnConsole(numbersToWords);
        context.close();
    }
}
