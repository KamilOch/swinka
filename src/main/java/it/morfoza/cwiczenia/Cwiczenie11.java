package it.morfoza.cwiczenia;

//Pętle

public class Cwiczenie11 {
    public static void main (String[] args) {
        //Petla while
        int licznik = 0;

        while(licznik<10){
            System.out.println("To jest pętla");
            licznik++;
        }
        System.out.println("Koniec pętli");

        //Petla do

        do{
            System.out.println("To jest petla");
            licznik++;
        }
        while(licznik<10);
        System.out.println("Koniec pętli");

        // Petla for

        for(int i=0; i<100; i++){
            System.out.println("To jest pętla");
        }
        System.out.println("Koniec pętli");

    }
}
