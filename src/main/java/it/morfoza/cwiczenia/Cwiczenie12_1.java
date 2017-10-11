package it.morfoza.cwiczenia;

//Tablice jednowymiarowe praca domowa

import java.util.Scanner;

public class Cwiczenie12_1 {
    public static void main (String [] args) {
        String [] tab = new String[5];

        Scanner odczyt = new Scanner(System.in);
        //pobieranie danych
        System.out.println("Podaj pięć imion");
        for (int i=0; i<5; i++)
            tab[i]= odczyt.nextLine();

        for (int i=0; i<5; i++)
        System.out.println("Witaj "+ tab[i]);

    }

}
