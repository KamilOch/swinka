package KJS2018_2_5;

public class Pracownik {

    String imie;
    String nazwisko;
    int wiek;

    public Pracownik (){}

    public Pracownik (String i,String n, int w){
        imie = i;
        nazwisko = n;
        wiek = w;
    }

    public Pracownik (Pracownik pracownik){
        imie = pracownik.imie;
        nazwisko = pracownik.nazwisko;
        wiek = pracownik.wiek;
    }


}
