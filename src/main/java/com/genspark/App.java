package com.genspark;

import com.genspark.Converters.IndianNumbersToWords;
import com.genspark.Converters.NumbersToWords;
import com.genspark.Converters.WesternNumbersToWords;
import com.genspark.NumbersMap.IndianMagnitudes;
import com.genspark.NumbersMap.LongScaleBritishMagnitudes;
import com.genspark.NumbersMap.LongScaleEuropeanMagnitudes;
import com.genspark.NumbersMap.ModernMagnitudes;
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

        WesternNumbersToWords westernNumbersToWords = new WesternNumbersToWords();
        westernNumbersToWords.setMagnitudes(new ModernMagnitudes());
        westernNumbersToWords.setNumberString(number);
        IndianNumbersToWords indianNumbersToWords = new IndianNumbersToWords();
        indianNumbersToWords.setMagnitudes(new IndianMagnitudes());
        indianNumbersToWords.setNumberString(number);
        WesternNumbersToWords longScaleEuropean = new WesternNumbersToWords();
        longScaleEuropean.setMagnitudes(new LongScaleEuropeanMagnitudes());
        longScaleEuropean.setNumberString(number);
        WesternNumbersToWords longScaleBritish = new WesternNumbersToWords();
        longScaleBritish.setMagnitudes(new LongScaleBritishMagnitudes());
        longScaleBritish.setNumberString(number);
        System.out.printf("   Western Modern number system: %s%n" +
                        "   Indian English number system: %s%n" +
                        "   Traditional European long scale number system: %s%n" +
                        "   Traditional British long scale number system: %s%n",
                westernNumbersToWords.getWords(),
                indianNumbersToWords.getWords(),
                longScaleEuropean.getWords(),
                longScaleBritish.getWords());
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
