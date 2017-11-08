package it.morfoza.program2_5;

public class Pracownik {
    String Imie;
    String Nazwisko;
    int Wiek;

    public Pracownik(){
        Imie ="nie_podano ";
        Nazwisko="nie_podano ";
        Wiek=0;
    }

    public Pracownik(String imie, String nazwisko, int wiek){
        Imie = imie;
        Nazwisko = nazwisko;
        Wiek = wiek;
    }

    public Pracownik(Pracownik pracownik){
        Imie = pracownik.Imie;
        Nazwisko = pracownik.Nazwisko;
        Wiek = pracownik.Wiek;
    }

}
