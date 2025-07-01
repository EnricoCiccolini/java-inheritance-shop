package com.inheritance.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Smartphone sumsung = new Smartphone(1234, "123stella", "sumsung", new BigDecimal(100), new BigDecimal(0.22),
                "ciao a tutti sono il codice imei ", 100000);

        Televisore sumsung12 = new Televisore(1234, "123mail", "sumsung12", new BigDecimal(122), new BigDecimal(0.22),
                22, false);

        Cuffie razers = new Cuffie(34566, "kraken", "razers", new BigDecimal(50), new BigDecimal(0.22), "blu", false);

        System.out.println(sumsung.getInfo());
        System.out.println(sumsung12.getInfo());
        System.out.println(razers.getInfo());

    }

}
