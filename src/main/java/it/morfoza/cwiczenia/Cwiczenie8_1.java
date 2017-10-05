package it.morfoza.cwiczenia;

//Podstawowe wejście / wyjście Praca domowa

import java.util.Scanner;

public class Cwiczenie8_1 {
    public static void main (String[] args) {
        double a;
        double b;

        Scanner odczyt = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe");
        a = odczyt.nextDouble();
        System.out.println("podaj druga liczbe");
        b = odczyt.nextDouble();

        System.out.println("a+b= "+(a+b));
        System.out.println("a-b= "+(a-b));
        System.out.println("a*b= "+(a*b));
        System.out.println("a/b= "+(a/b));




    }
}
