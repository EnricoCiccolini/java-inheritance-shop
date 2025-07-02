package com.inheritance.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Smartphone extends Prodotto {

    String codiceImei;
    int memoria;

    public Smartphone(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, String codiceimei,
            int memoria) {
        super(codice, nome, marca, prezzo, iva);
        this.codiceImei = codiceimei;
        this.memoria = memoria;
    }

    public void setCodiceImei(String codiceImei) {
        this.codiceImei = codiceImei;
    }

    public String getCodiceImei() {
        return this.codiceImei;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getmemoria() {
        return this.memoria;
    }

    @Override
    public String getInfo() {

        return super.getInfo() + " conuna memoria di  " + memoria + "il cui codice imei è" + codiceImei;
    }

    @Override
    public BigDecimal prezzoScontato(boolean tessera) {
        if (tessera && memoria < 32) {
            BigDecimal scontone = new BigDecimal(0.05);
            BigDecimal totale = prezzo.add(iva.multiply(prezzo)).subtract(prezzo.multiply(scontone)).setScale(2,
                    RoundingMode.DOWN);
            return totale;
        } else {

            BigDecimal totale = prezzo.add(iva.multiply(prezzo)).subtract(prezzo.multiply(sconto)).setScale(2,
                    RoundingMode.DOWN);
            return totale;
        }

    }
}