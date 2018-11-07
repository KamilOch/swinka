package KJS2018_2_3;

import java.util.Random;

public class Punkt {

    int wspX;
    int wspY;

     int zwiekszXO1 (){
        wspX++;
        return wspX;
    }
     int zwiekszYO1 (){
        wspY++;
        return wspY;
    }



     void dodajWartoscDoX (int wartosc){
         wspX += wartosc;
    }

    void dodajWartoscDoY (int wartosc){
        wspY += wartosc;
    }

     int dajWspX (){
        return wspX;
    }

    int dajWspY (){
        return wspY;
    }

    void drukowanieX () {
        System.out.println("Wartosc X to : " + wspX);
    }
    void drukowanieY (){

        System.out.println("Wartosc Y to : "+wspY);
    }

}
