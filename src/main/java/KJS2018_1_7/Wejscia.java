package KJS2018_1_7;


import java.util.Scanner;

public class Wejscia {
    public static void main(String[] args) {

        double a;
        double b;

        Scanner odczyt = new Scanner (System.in);

        System.out.println("Podaj liczbę a");
        a = odczyt.nextDouble();

        System.out.println("Podaj liczbę b");
        b = odczyt.nextDouble();

        System.out.println("Wynik dodawania "+(a+b));
        System.out.println("Wynik odejmowania "+(a-b));
        System.out.println("Wynik mnozenia "+(a*b));
        System.out.println("Wynik dzielenia "+(a/b));

    }
}
