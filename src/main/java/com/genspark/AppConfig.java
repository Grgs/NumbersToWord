package com.genspark;

import com.genspark.NumbersMap.ModernNumbersMap;
import com.genspark.NumbersMap.NumbersMap;
import com.genspark.NumbersToWords.NumbersToWords;
import com.genspark.NumbersToWords.WesternNumbersToWords;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.genspark")
public class AppConfig {
    @Bean(name = "numbersMap")
    public NumbersMap getNumbersMap() {
        return new ModernNumbersMap();
    }

    @Bean(name = "numbersToWords")
    public NumbersToWords getNumbersToWords() {
        WesternNumbersToWords numbersToWords = new WesternNumbersToWords();
        numbersToWords.setNumbersMap(getNumbersMap());
        return numbersToWords;
//        return new IndianNumbersToWords();
    }
}
