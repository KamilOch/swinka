package it.morfoza.cwiczenia;

//Podstawowe wejście / wyjście

import java.util.Scanner;

public class Cwiczenie8 {
    public static void main (String[] ags) {
     String imie; //na nim zapiszemy swoje imie
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika

        imie = odczyt.nextLine();

        System.out.println(("Witaj "+imie)); // wyświetlamy powitanie

    }
}
