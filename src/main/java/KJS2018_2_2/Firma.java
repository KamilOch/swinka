package KJS2018_2_2;

public class Firma {
    public static void main(String[] args) {

       Pracownik [] pracownicy = new Pracownik[3];

       String [] imiona = {"Adam", "Zosia", "Kasia"};
       String [] nazwiska = {"Kowalski", "Gajda", "Pokemon"};
       int [] wiek = {20,30,40};

       for(int i=0 ; i<pracownicy.length ; i++){
           pracownicy [i] = new Pracownik();
           pracownicy[i].imie = imiona[i];
           pracownicy[i].nazwisko = nazwiska[i];
           pracownicy[i].wiek = wiek[i];
       }

       System.out.println("Pracownic fimry to :");

       for(int p=0 ; p < pracownicy.length ; p++){
           System.out.println(pracownicy[p].imie+" "+pracownicy[p].nazwisko+" "+pracownicy[p].wiek);
       }


    }
}
