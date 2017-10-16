package it.morfoza.cwiczenia;

//Pętla for each

public class Cwiczenie14 {
    public static void main (String[] args) {

        int[] tablica = new int[10];
         //wypełnienie tablicy
        for(int i=0; i<10; i++)
        tablica[i] = i+1;

        //wyświetlenie przy użyciu pętli for each
        for(int x : tablica)
        System.out.println(x);

    }
}
