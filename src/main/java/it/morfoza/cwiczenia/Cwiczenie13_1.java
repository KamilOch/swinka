package it.morfoza.cwiczenia;

//Tablice wielowymiarowe praca domowa

public class Cwiczenie13_1 {
    public static void main (String [] arg) {

        int[][] tablica = new int[2][3];
        int licznik=0;

        for (int i=0; i<tablica.length; i++) {
            for (int j=0; j<tablica[i].length; j++)
                tablica[i][j] = licznik++;
        }

        for (int i=0; i<tablica.length; i++) {
            for (int j=0; j<tablica[i].length;j++)
                System.out.printf("tablica[%d][%d]=%d \n",i,j,tablica[i][j]);

        }


    }
}
