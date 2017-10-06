package it.morfoza.cwiczenia;

//Pętle praca domowa

import java.util.Scanner;

public class Cwiczenie11_1 {
    public static void main (String[] args) {

        int liczba;

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        liczba=odczyt.nextInt();

        while(liczba>0) {
            System.out.println("Bomba wybuchnie za " + liczba);
            liczba--;
        }
        System.out.println("BOOM!!!!!!!");
    }
}
