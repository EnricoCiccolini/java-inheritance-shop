package com.inheritance.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Televisore extends Prodotto {

    int pollici;
    boolean isSmart;

    public Televisore(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, int pollici,
            boolean isSmart) {
        super(codice, nome, marca, prezzo, iva);
        this.pollici = pollici;
        this.isSmart = isSmart;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public int getPollici() {
        return pollici;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    public boolean getIsSmart() {
        return isSmart;
    }

    @Override
    public String getInfo() {
        String frase = " non è smart";
        if (isSmart) {
            frase = "è smart";
        }
        return super.getInfo() + " di " + pollici + "pollici" + frase;
    }

    @Override
    public BigDecimal prezzoScontato(boolean tessera) {
        if (tessera && !isSmart) {
            BigDecimal scontone = new BigDecimal(0.10);
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
