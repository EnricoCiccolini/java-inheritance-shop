package com.inheritance.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Smartphone sumsung = new Smartphone(1234, "123stella", "sumsung", new BigDecimal(100), new BigDecimal(0.22),
                "ciaso a tutti sono il codice imei ", 100000);
        Televisore sumsung12 = new Televisore(1234, "123stella", "sumsung", new BigDecimal(100), new BigDecimal(0.22),
                22, false);

        System.out.println(sumsung.GetInfo());

    }

}
