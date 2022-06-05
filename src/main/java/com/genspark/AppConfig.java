package com.genspark;

import com.genspark.Converters.NumbersToWords;
import com.genspark.Converters.WesternNumbersToWords;
import com.genspark.NumbersMap.Magnitudes;
import com.genspark.NumbersMap.ModernMagnitudes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Application configuration.
 */
@Configuration
@ComponentScan(basePackages = "com.genspark")
public class AppConfig {
    @Bean(name = "magnitudes")
    public Magnitudes getMagnitude() {
        return new ModernMagnitudes();
    }

    @Bean(name = "numbersToWords")
    public NumbersToWords getNumbersToWords() {
        return new WesternNumbersToWords();
    }

}
