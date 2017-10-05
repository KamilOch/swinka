package it.morfoza.cwiczenia;

//Konwersja i Rzutowanie typów

public class Cwiczenie7 {
    public static void main (String [] args) {
        int a =5;
        double b = 13.5;
        double c = b/a;

        int d = (int)b/a;

        System.out.println(c);
        System.out.println(d);
    }
}
