package it.morfoza.cwiczenia;

//Tablice wielowymiarowe

public class Cwiczenie13 {
    public static void main (String[] args) {

       // int [][] tablica = new int[3][3];
        // tablica[2][1]=5;
        // int zmienna = tablica [2][1];


        int[][] tablica2 = new int[3][];
        tablica2[0]= new int[3];
        tablica2[1]= new int[2];
        tablica2[2]= new int[1];

        for (int i=0; i<tablica2.length; i++) {
            for (int j = 0; j < tablica2[i].length; j++)
                tablica2[i][j] = 0;
        }
        for (int i=0; i<tablica2.length; i++) {
            for (int j = 0; j < tablica2[i].length; j++)
                System.out.print(tablica2[i][j]);
            System.out.println();
        }
    }
}
