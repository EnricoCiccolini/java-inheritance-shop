package com.inheritance.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cuffie extends Prodotto {

    String colore;
    boolean isWireless;

    public Cuffie(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore,
            boolean isWireless) {
        super(codice, nome, marca, prezzo, iva);
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getColore() {
        return this.colore;
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    public boolean getIsWireless() {
        return isWireless;
    }

    @Override
    public String getInfo() {
        String frase = " non sono wireless";
        if (isWireless) {
            frase = " sono wireless";
        }
        return super.getInfo() + " del colore " + colore + frase;
    }

    @Override
    public BigDecimal prezzoScontato(boolean tessera) {
        if (tessera && !isWireless) {
            BigDecimal scontone = new BigDecimal(0.07);
            BigDecimal totale = prezzo.add(iva.multiply(prezzo)).subtract(prezzo.multiply(scontone)).setScale(2,
                    RoundingMode.DOWN);
            return totale;
        }
        return super.prezzoScontato(tessera);

    }

}
