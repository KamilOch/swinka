package it.morfoza.cwiczenia;

//Pętle  FOR!!! praca domowa


import java.util.Scanner;

public class Cwiczenie11_3 {
    public static void main (String [] args) {
        Scanner odczyt = new Scanner(System.in);
        int liczba;
        System.out.println("Podaj liczbę");

        for ( liczba = odczyt.nextInt() ; liczba>0 ; liczba-- ) {
            System.out.println("Bomba wybuchnie za " + liczba);
        }
        System.out.println("BOOOM!!!!!");
    }
}
