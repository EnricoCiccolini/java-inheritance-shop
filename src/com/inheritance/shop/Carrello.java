package com.inheritance.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        boolean continua = true;
        Scanner shop = new Scanner(System.in);
        Prodotto[] carrelloProdotti = new Prodotto[0];
        BigDecimal totalecarrello = BigDecimal.ZERO;
        boolean tessera = false;

        while (continua) {
            String type = "";
            boolean controlloProdotto = true;
            Prodotto nuovo = null;

            boolean checkTessera = true;
            while (checkTessera) {
                System.out.println("hai la tessera? si o no");
                String check;
                check = shop.nextLine().toLowerCase().trim();
                if (check.equals("si")) {
                    tessera = true;
                    checkTessera = false;
                } else if (check.equals("no")) {
                    tessera = false;
                    checkTessera = false;
                } else {
                    System.out.println("inserisci un valore valido");
                }
            }

            while (controlloProdotto) {
                System.out.println("ciao cosa vuoi aggiungere al carrello ? cuffie, smartphone o televisore?");
                type = shop.nextLine().toLowerCase().trim();

                if (type.equals("cuffie")) {

                    nuovo = creaCuffie(shop);
                    controlloProdotto = false;

                } else if (type.equals("smartphone")) {
                    nuovo = creaSmartphone(shop);
                    controlloProdotto = false;

                } else if (type.equals("televisore")) {

                    nuovo = creaTelevisore(shop);
                    controlloProdotto = false;

                } else {
                    System.out.println("inserisci un prodotto valido");
                }
            }

            Prodotto[] newcarrello = new Prodotto[carrelloProdotti.length + 1];
            for (int i = 0; i < carrelloProdotti.length; i++) {
                newcarrello[i] = carrelloProdotti[i];
            }
            newcarrello[newcarrello.length - 1] = nuovo;
            carrelloProdotti = newcarrello;

            boolean controlloContinua = true;

            while (controlloContinua) {
                System.out.println("vuoi comprare altro? si o no");
                String check;
                check = shop.nextLine().toLowerCase().trim();
                if (check.equals("si")) {
                    continua = true;
                    controlloContinua = false;
                } else if (check.equals("no")) {
                    continua = false;
                    controlloContinua = false;
                } else {
                    System.out.println("inserisci un valore valido");
                }
            }
        }
        System.out.println("---------------------------------------------------------------------");

        System.out.println(carrelloProdotti.length);

        for (Prodotto prodotto : carrelloProdotti) {
            System.out.println(prodotto.getInfo());
            totalecarrello = totalecarrello.add(prodotto.prezzoScontato(tessera));

        }

        System.out.println("il totale è " + totalecarrello);
        shop.close();
    }

    // metodi//
    static Prodotto creaCuffie(Scanner shop) {
        int codice;
        String nome;
        String marca;
        BigDecimal prezzo;
        BigDecimal iva;
        String colore;
        boolean isWireless;

        System.out.println("dammi il codice ");
        codice = shop.nextInt();
        shop.nextLine();
        System.out.println("dammi il nome ");
        nome = shop.nextLine();
        System.out.println("dammi la marca ");
        marca = shop.nextLine();
        System.out.println("dammi il prezzo ");
        prezzo = shop.nextBigDecimal();
        shop.nextLine();
        System.out.println("dammi l iva ");
        iva = shop.nextBigDecimal();
        shop.nextLine();
        System.out.println("dammi il colore ");
        colore = shop.nextLine();
        System.out.println("dammi se sono wireles  ");
        isWireless = shop.nextBoolean();

        Cuffie add = new Cuffie(codice, nome, marca, prezzo, iva, colore, isWireless);
        return add;
    }

    static Prodotto creaTelevisore(Scanner shop) {
        int codice;
        String nome;
        String marca;
        BigDecimal prezzo;
        BigDecimal iva;
        int pollici;
        boolean isSmart;

        System.out.println("dammi il codice ");
        codice = shop.nextInt();
        shop.nextLine();
        System.out.println("dammi il nome ");
        nome = shop.nextLine();
        System.out.println("dammi la marca ");
        marca = shop.nextLine();
        System.out.println("dammi il prezzo ");
        prezzo = shop.nextBigDecimal();
        shop.nextLine();
        System.out.println("dammi l iva ");
        iva = shop.nextBigDecimal();
        shop.nextLine();
        System.out.println("dammi i pollici ");
        pollici = shop.nextInt();
        shop.nextLine();
        System.out.println("dammi il colore ");
        isSmart = shop.nextBoolean();
        shop.nextLine();

        Televisore add = new Televisore(codice, nome, marca, prezzo, iva, pollici, isSmart);
        return add;

    }

    static Prodotto creaSmartphone(Scanner shop) {
        int codice;
        String nome;
        String marca;
        BigDecimal prezzo;
        BigDecimal iva;
        String codiceImei;
        int memoria;

        System.out.println("dammi il codice ");
        codice = shop.nextInt();
        shop.nextLine();
        System.out.println("dammi il nome ");
        nome = shop.nextLine();
        System.out.println("dammi la marca ");
        marca = shop.nextLine();
        System.out.println("dammi il prezzo ");
        prezzo = shop.nextBigDecimal();
        shop.nextLine();
        System.out.println("dammi l iva ");
        iva = shop.nextBigDecimal();
        shop.nextLine();
        System.out.println("dammi la memoria ");
        memoria = shop.nextInt();
        shop.nextLine();
        System.out.println("dammi il colore ");
        codiceImei = shop.nextLine();

        Smartphone add = new Smartphone(codice, nome, marca, prezzo, iva, codiceImei, memoria);
        return add;

    }
}