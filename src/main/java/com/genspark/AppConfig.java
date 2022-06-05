package com.genspark;

import com.genspark.NumbersMap.ModernNumbersWords;
import com.genspark.NumbersMap.NumbersWords;
import com.genspark.Converters.NumbersToWords;
import com.genspark.Converters.WesternNumbersToWords;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Application configuration.
 */
@Configuration
//@ComponentScan(basePackages = "com.genspark")
public class AppConfig {
    @Bean(name = "numbersWords")
    public NumbersWords getNumbersMap() {
        return new ModernNumbersWords();
    }

    @Bean(name = "numbersToWords")
    public NumbersToWords getNumbersToWords() {
        WesternNumbersToWords numbersToWords = new WesternNumbersToWords();
        numbersToWords.setNumbersMap(getNumbersMap());
        return numbersToWords;
//        return new IndianNumbersToWords();
    }
}
