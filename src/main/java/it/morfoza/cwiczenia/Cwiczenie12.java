package it.morfoza.cwiczenia;

//Tablice jednowymiarowe

public class Cwiczenie12 {
    public static void main ( String [] args) {

        int[] tablica = new int[10];

        for (int i=0; i<10; i++ )
           tablica[i] =i+1;

        int zmienna = tablica[3];

        for (int i=0; i<10; i++)
            System.out.println("Kolejna komórka to: "+ tablica[i]);

    }
}
