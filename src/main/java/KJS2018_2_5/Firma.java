package KJS2018_2_5;

public class Firma {
    public static void main(String[] args) {

    Pracownik pracownik1 = new Pracownik();
        System.out.println("wartosci imienia "+ pracownik1.imie);
        System.out.println("wartosci nazwisko "+ pracownik1.nazwisko);
        System.out.println("wartosci wiek "+ pracownik1.wiek);
        System.out.println("");
    Pracownik pracownik2 = new Pracownik("Adam" , "Kowalski" , 20);
        System.out.println("wartosci imienia "+ pracownik2.imie);
        System.out.println("wartosci nazwisko "+ pracownik2.nazwisko);
        System.out.println("wartosci wiek "+ pracownik2.wiek);
        System.out.println("");
    Pracownik pracownik3 = new Pracownik(pracownik2);
        System.out.println("wartosci imienia "+ pracownik3.imie);
        System.out.println("wartosci nazwisko "+ pracownik3.nazwisko);
        System.out.println("wartosci wiek "+ pracownik3.wiek);
        System.out.println("");

        Pracownik[] pracownicy = new Pracownik[3];
        pracownicy[0] = new Pracownik();
        pracownicy[1] = new Pracownik("Staszek", "Kowalski", 34);
        pracownicy[2] = new Pracownik(pracownicy[1]);

        for(Pracownik p: pracownicy){
          System.out.println("prac"+" "+p.imie+" "+p.nazwisko+" "+p.wiek);
       }
    }



}
