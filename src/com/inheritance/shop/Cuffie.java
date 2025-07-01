package com.inheritance.shop;

import java.math.BigDecimal;

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

}
