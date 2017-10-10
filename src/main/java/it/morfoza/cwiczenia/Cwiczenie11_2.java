package it.morfoza.cwiczenia;

//Pętle "do ....while praca domowa

import java.util.Scanner;

public class Cwiczenie11_2 {
    public static void main (String [] args) {

    int liczba;

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        liczba=odczyt.nextInt();

        do {
            System.out.println("Bomba wybuchnie za " + liczba);
            liczba--;
        }
        while (liczba>0);
        System.out.println("BOOM!!!!!!");


    }
}
