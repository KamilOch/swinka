package it.morfoza.cwiczenia;

//Instrukcje sterujace

import java.util.Scanner;

public class Cwiczenie9 { //test IF
    public static void main (String[] args ) {
        int zmienna;

        //Modyfikacja przykladu any podawac liczbe z konsoli
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbę do analizy");
        zmienna = odczyt.nextInt();

        if(zmienna%2 == 0)
            System.out.println("Liczba parzysta");

        else
            System.out.println("Liczba nieparzysta");

        if (zmienna>10)
            System.out.println("Liczba wieksza od 10");

        else if (zmienna>0 && zmienna<=10)
            System.out.println("Liczba dodatnia mniejsza lub rowna 10");

            else
            System.out.println("Liczba ujemna");


    }
}
