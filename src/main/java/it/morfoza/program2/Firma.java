package it.morfoza.program2;

public class Firma {
    public static void main (String args[]){

       Pracownik pracownik1 = new Pracownik();
       Pracownik pracownik2 = new Pracownik();
       pracownik1.imie = "Roman";
       pracownik1.nazwisko = "Kowalski";
       pracownik1.wiek = 40;

       pracownik2.imie = "Włodek";
       pracownik2.nazwisko = "Zięba";
       pracownik2.wiek = 44;

       System.out.println("Pracownicy firmy to: \n");
       System.out.println("Imię "+(pracownik1.imie)+"\nNazwisko "+(pracownik1.nazwisko)+"\nWiek "+(pracownik1.wiek ));

       System.out.println("\nImię "+(pracownik2.imie)+"\nNazwisko "+(pracownik2.nazwisko)+"\nWiek "+(pracownik2.wiek ));

    }
}
