package KJS2018_2_3;

public class Test {

    public static void main(String[] args) {

        Punkt punkt1 = new Punkt();

        punkt1.wspX = 10;
        punkt1.wspY = 20;

        punkt1.zwiekszXO1();
        punkt1.drukowanieX();

        punkt1.zwiekszYO1();
        punkt1.drukowanieY();

        punkt1.dodajWartoscDoX(5);
        punkt1.drukowanieX();

        punkt1.dodajWartoscDoY(10);
        punkt1.drukowanieY();

        int watrosc = punkt1.dajWspX();
        System.out.println("wartosc = " + watrosc);

        int watrosc1 = punkt1.dajWspY();
        System.out.println("wartosc = " + watrosc1);




    }

}
