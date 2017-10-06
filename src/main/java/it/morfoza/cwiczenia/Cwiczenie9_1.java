package it.morfoza.cwiczenia;

//Instrukcje sterujace Praca domowa
import java.util.Scanner;

public class Cwiczenie9_1 {
    public static void main (String[] args) {
    double a;
    double b;

    Scanner odczyt = new Scanner(System.in);

    System.out.println("Podaj wartość pierwszej liczby");
    a = odczyt.nextDouble();
    System.out.println("Podaj wartość drugiej liczby");
    b = odczyt.nextDouble();

    if (a==b)
        System.out.println("Liczba pierwsza równa liczbie drugiej");
    else if (a>b)
        System.out.println("Liczba pierwsza jest wieksza od liczby drugiej");
    else
        System.out.println("Liczba pierwsza mniejsza niż liczba druga");

    }
}
