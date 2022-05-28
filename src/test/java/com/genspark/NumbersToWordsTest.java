package com.genspark;

import junit.framework.TestCase;

public class NumbersToWordsTest extends TestCase {

    public void testGetWords() {
        NumbersToWords numbersToWords = new NumbersToWords();
        numbersToWords.setNumberString("-1");
        assertEquals("negative one", numbersToWords.getWords());
        numbersToWords.setNumberString("0");
        assertEquals("zero", numbersToWords.getWords());
        numbersToWords.setNumberString("1");
        assertEquals("one", numbersToWords.getWords());
        numbersToWords.setNumberString("10");
        assertEquals("ten", numbersToWords.getWords());
        numbersToWords.setNumberString("11");
        assertEquals("eleven", numbersToWords.getWords());
        numbersToWords.setNumberString("100");
        assertEquals("one hundred", numbersToWords.getWords());
        numbersToWords.setNumberString("101");
        assertEquals("one hundred and one", numbersToWords.getWords());
        numbersToWords.setNumberString("110");
        assertEquals("one hundred and ten", numbersToWords.getWords());
        numbersToWords.setNumberString("111");
        assertEquals("one hundred and eleven", numbersToWords.getWords());
        numbersToWords.setNumberString("1000");
        assertEquals("one thousand", numbersToWords.getWords());
        numbersToWords.setNumberString("1001");
        assertEquals("one thousand one", numbersToWords.getWords());
        numbersToWords.setNumberString("1010");
        assertEquals("one thousand ten", numbersToWords.getWords());
        numbersToWords.setNumberString("1011");
        assertEquals("one thousand eleven", numbersToWords.getWords());
        numbersToWords.setNumberString("1100");
        assertEquals("one thousand one hundred", numbersToWords.getWords());
        numbersToWords.setNumberString("1101");
        assertEquals("one thousand one hundred and one", numbersToWords.getWords());
        numbersToWords.setNumberString("1110");
        assertEquals("one thousand one hundred and ten", numbersToWords.getWords());
        numbersToWords.setNumberString("1111");
        assertEquals("one thousand one hundred and eleven", numbersToWords.getWords());
        numbersToWords.setNumberString("8000");
        assertEquals("eight thousand", numbersToWords.getWords());
        numbersToWords.setNumberString("999,000");
        assertEquals("nine hundred and ninety-nine thousand", numbersToWords.getWords());
        numbersToWords.setNumberString("6,999,000");
        assertEquals("six million nine hundred and ninety-nine thousand", numbersToWords.getWords());
    }
}