package com.inheritance.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public Prodotto(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // private void setCodice(int codice) {
    // this.codice = codice;
    // }

    public int getCodice() {
        return this.codice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String GetNome() {
        return this.nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String Getmarca() {
        return this.marca;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal Getprezzo() {
        return this.prezzo.setScale(2, RoundingMode.DOWN);
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal GetIva() {
        return this.iva.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal PrezzoConIva() {
        BigDecimal totale = prezzo.add(iva.multiply(prezzo));
        return totale;

    }

    public String getInfo() {
        String result;
        BigDecimal totale = prezzo.add(iva.multiply(prezzo)).setScale(2, RoundingMode.DOWN);
        result = "il prodotto si chiama " + this.nome + " con codice " + this.codice + " della marca " + this.marca
                + " al prezzo di " + prezzo + " con iva di " + iva.setScale(2, RoundingMode.DOWN)
                + " prezzo comprensico di iva " + totale;

        return result;
    }

}
