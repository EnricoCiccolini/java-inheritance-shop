package com.inheritance.shop;

import java.math.BigDecimal;

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

}
