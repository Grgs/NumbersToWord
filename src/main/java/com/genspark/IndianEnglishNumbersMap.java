package com.genspark;

import org.springframework.stereotype.Component;

@Component
public class IndianEnglishNumbersMap extends ModernNumbersMap {
    IndianEnglishNumbersMap() {
        super();
        this.tensMap.remove(Math.pow(10, 9));
        this.tensMap.remove(Math.pow(10, 12));
        this.tensMap.remove(Math.pow(10, 15));
        this.tensMap.remove(Math.pow(10, 18));
        this.tensMap.remove(Math.pow(10, 21));
        this.tensMap.remove(Math.pow(10, 24));
        this.tensMap.remove(Math.pow(10, 27));
        this.tensMap.remove(Math.pow(10, 30));
        this.tensMap.remove(Math.pow(10, 33));
        this.tensMap.remove(Math.pow(10, 36));
        this.tensMap.remove(Math.pow(10, 39));
        this.tensMap.remove(Math.pow(10, 42));
        this.tensMap.remove(Math.pow(10, 45));
        this.tensMap.remove(Math.pow(10, 48));
        this.tensMap.remove(Math.pow(10, 51));
        this.tensMap.remove(Math.pow(10, 54));
        this.tensMap.remove(Math.pow(10, 57));
        this.tensMap.remove(Math.pow(10, 60));
        this.tensMap.remove(Math.pow(10, 63));

        this.tensMap.put(Math.pow(10, 5), "Lakh");
        this.tensMap.put(Math.pow(10, 7), "Crore");
        this.tensMap.put(Math.pow(10, 9), "Arab");
        this.tensMap.put(Math.pow(10, 11), "Kharab");
        this.tensMap.put(Math.pow(10, 13), "Nil");
        this.tensMap.put(Math.pow(10, 15), "Padma");
        this.tensMap.put(Math.pow(10, 17), "Shankh");
    }
}
