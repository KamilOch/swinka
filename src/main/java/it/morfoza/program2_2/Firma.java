package it.morfoza.program2_2;


public class Firma {
    public static void main (String args[]){
        Pracownik[] pracownicy = new Pracownik[3];

        String[] imiona = {"Roman", "Włodek", "Przemek"};
        String[] nazwiska = {"Kowalski", "Zięba", "Wilczewski"};
        int[] wiek =  {40,44,35};

        for(int i=0; i<pracownicy.length; i++){
            pracownicy[i]= new Pracownik();
            pracownicy[i].imie = imiona(i);
            pracownicy[i].nazwisko = nazwiska(i);
            pracownicy[i].wiek = wiek(i);
        }
    System.out.println("Pracownicy firmy to: ");
        for(int i=0; i<pracownicy.length; i++)
            System.out.println(pracownicy[i].imie+","+pracownicy[i].nazwisko+"," +pracownicy[i].wiek+"lat");

    }
}
