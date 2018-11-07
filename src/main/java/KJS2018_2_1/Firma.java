package KJS2018_2_1;

public class Firma {
    public static void main (String [] args ) {

        Pracownik pracownik1 = new Pracownik();
        Pracownik pracownik2 = new Pracownik();


        pracownik1.imie = "Bogdan";
        pracownik1.nazwisko = "Kowalski";
        pracownik1.wiek = 20;

        pracownik2.imie = "Edek";
        pracownik2.nazwisko = "Bodzio";
        pracownik2.wiek = 30;

        System.out.println("Pracownik 1 imie :" + pracownik1.imie+" nazwisko :" + pracownik1.nazwisko + " wiek :" + pracownik1.wiek);
        System.out.println("Pracownik 2 imie :" + pracownik2.imie+" nazwisko :" + pracownik2.nazwisko + " wiek :" + pracownik2.wiek);


    }
}
