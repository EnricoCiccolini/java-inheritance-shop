package com.inheritance.shop;

import java.math.BigDecimal;

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

}
