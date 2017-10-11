package it.morfoza.cwiczenia;

//Tablice jednowymiarowe praca domowa

import java.util.Scanner;

public class Cwiczenie12_2 {
    public static void main (String[] args) {

        Scanner odczyt = new Scanner(System.in);
        int n= odczyt.nextInt();

       int[] tablica = new int[n];


       for (int i=0; i<n; i++ )
            tablica[i] =i+1;

       int licznik =0;
       while ( licznik < n) {
           System.out.println("Kolejna komórka to: " + tablica[licznik]);
           licznik++;
       }
    }
}
