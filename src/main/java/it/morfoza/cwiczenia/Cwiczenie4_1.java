package it.morfoza.cwiczenia;



// Zmienne praca domowa
public class Cwiczenie4_1 {
    public static void main (String[] args) {
        int liczba =1;
        System.out.println(liczba);
        char znak = 'K';
        System.out.println(znak);
        double liczba1, liczba2;
        liczba1 =7.7;
        liczba2 =8.9;
        System.out.println(liczba1);
        System.out.println(liczba2);
        System.out.println(liczba1-liczba2);
        System.out.println(liczba1+liczba2);

        final double liczbaPi =3.1415;
        final int finalna2;

        finalna2=1;
        System.out.println(liczbaPi);
        System.out.println(finalna2);

        String jeden = "Witaj ";
        String dwa = "Kapitanie ";
        String trzy = "poziomka!";
        String cztery = jeden+dwa+trzy;
        System.out.println(cztery);

        String piec = cztery.substring(0,16);
        System.out.println(piec);
    }
}
