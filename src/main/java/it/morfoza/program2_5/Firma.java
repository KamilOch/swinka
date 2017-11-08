package it.morfoza.program2_5;


import javax.print.attribute.standard.PageRanges;

public class Firma {

    public static void main (String srgs[]){

        Pracownik[] pracownicy = new Pracownik[6];
        pracownicy[0] = new Pracownik();
        pracownicy[1] = new Pracownik("Roman", "Włodarczyk",34);
        pracownicy[2] = new Pracownik("Wiesław", "Powolski", 44);
        pracownicy[3] = new Pracownik("","Kwiatkowski", 40);
        pracownicy[4] = new Pracownik("Marian","",50);
        pracownicy[5] = new Pracownik("Karol", "Koza", 0);

        for (Pracownik p: pracownicy)
            System.out.println("Pracownik "+p.Imie+" "+p.Nazwisko+" "+p.Wiek);






    }
}
