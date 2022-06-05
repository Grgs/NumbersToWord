package com.genspark;

import com.genspark.NumbersMap.ModernMagnitudes;
import com.genspark.Converters.WesternNumbersToWords;
import junit.framework.TestCase;

public class WesternNumbersToWordsTest extends TestCase {

    public void testGetWords() {
        WesternNumbersToWords westernNumbersToWords = new WesternNumbersToWords();
        westernNumbersToWords.setMagnitudes(new ModernMagnitudes());
        westernNumbersToWords.setNumberString("-1");
        assertEquals("negative one", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("0");
        assertEquals("zero", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("1");
        assertEquals("one", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("10");
        assertEquals("ten", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("11");
        assertEquals("eleven", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("100");
        assertEquals("one hundred", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("101");
        assertEquals("one hundred and one", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("110");
        assertEquals("one hundred and ten", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("111");
        assertEquals("one hundred and eleven", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("1000");
        assertEquals("one thousand", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("1001");
        assertEquals("one thousand one", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("1010");
        assertEquals("one thousand ten", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("1011");
        assertEquals("one thousand eleven", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("1100");
        assertEquals("one thousand one hundred", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("1101");
        assertEquals("one thousand one hundred and one", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("1110");
        assertEquals("one thousand one hundred and ten", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("1111");
        assertEquals("one thousand one hundred and eleven", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("8000");
        assertEquals("eight thousand", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("999,000");
        assertEquals("nine hundred and ninety-nine thousand", westernNumbersToWords.getWords());
        westernNumbersToWords.setNumberString("6,999,000");
        assertEquals("six million nine hundred and ninety-nine thousand", westernNumbersToWords.getWords());
    }
}