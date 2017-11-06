package it.morfoza.program2_3;

public class Test {
    public static void main (String[] args){
        Punkt punkt = new Punkt();
        punkt.x= 0;
        punkt.y= 0;

        punkt.zwiekszX();
        punkt.zwiekszY();
        punkt.wyswietl();

        punkt.zmienX(10);
        punkt.zmienY(5);
        punkt.wyswietl();

        int wartosc=punkt.dajX();
        System.out.println("wartosc: "+wartosc);
    }
}
