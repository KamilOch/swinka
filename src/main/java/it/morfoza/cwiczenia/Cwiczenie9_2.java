package it.morfoza.cwiczenia;

//Instrukcje sterujace Praca domowa 2

import java.util.Scanner;

public class Cwiczenie9_2 {
    public static void main ( String[] args) {

        String imie;
        String a= "Marek";
        String b= "Piotrek";

        Scanner odczyt = new Scanner(System.in);

        System.out.println("Podaj imię");
        imie = odczyt.nextLine();

        if (a.equals(imie))
            System.out.println("Jesteś bratem Agnieszki");
        else if (b.equals(imie))
            System.out.println("Jesteś wieklim programatorem");
        else
            System.out.println("Nie wiem kim jestes");





    }
}
