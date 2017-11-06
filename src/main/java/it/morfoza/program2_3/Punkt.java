package it.morfoza.program2_3;

public class Punkt {
    int x;
    int y;

    void zwiekszX (){
        x++;
    }
    void zwiekszY(){
        y++;
    }
   void zmienX(int liczba){
        x +=liczba;
}
    void zmienY(int liczba){
       y +=liczba;
    }
    int dajX(){
        return x;
    }
    int dajY(){
        return y;
    }
    void wyswietl(){
        System.out.println("x: "+x+", y: "+y);
    }
}

