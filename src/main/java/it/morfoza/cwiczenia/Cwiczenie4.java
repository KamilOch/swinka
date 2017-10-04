package it.morfoza.cwiczenia;
// Zmienne
public class Cwiczenie4 {
    public static void main(String[] args) {
        int liczba; // Deklaracja
        liczba = 5; // Inicjalizacja
        System.out.println(liczba);
        char znak='A';
        System.out.println(znak);

        int liczba1=5;
        int liczba2=liczba1;
         System.out.println(liczba1+liczba2);

         double liczba3, liczba4;
         liczba3 =5.0;
         liczba4 =3.3;
         System.out.println(liczba3);
         System.out.println(liczba4);

         int a=5;
         int b=3;
         System.out.println("a+b= "+(a+b));

         String hello= "Witaj ";
         String world = "Swiecie";
         String powitanie=hello+world; // lączenie Stringów
         System.out.println(powitanie);

         String czesc = powitanie.substring(0,6)+"uczniu";
         System.out.println(czesc);
    }
}