package com.genspark;

import com.genspark.NumbersToWords.WesternNumbersToWords;
import org.junit.Test;

public class AppTest {

    @Test
    public void testMain() {
        App.testing(new WesternNumbersToWords());
    }
}