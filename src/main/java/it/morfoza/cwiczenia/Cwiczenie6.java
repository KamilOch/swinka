package it.morfoza.cwiczenia;

//Funkcie matemetyczne i Wielkie Liczby
import java.math.BigInteger;

import static java.lang.Math.*;

public class Cwiczenie6 {
    public static void main (String[] args) {
    double liczba = 9;
    int b=3;
    double pierwiastek = sqrt(liczba);
    double potega = Math.pow(liczba, b);

    System.out.println("pierwiastek z " +liczba+ " wynosi " +pierwiastek);
    System.out.println("liczba" +liczba+ " podniesiona do potegi " +b+ " to " +potega);

    //Math.PI;
    //Math.E;
    //System.out.println(PI);
    BigInteger wielkaliczba = new BigInteger("1231231231231232123132132132132");
    System.out.println(wielkaliczba.toString());

   BigInteger x= new BigInteger("123123123123123123123");
   BigInteger y= new BigInteger("987153513513881352135");
   BigInteger suma = x.add(y);
   System.out.println("Suma "+suma.toString());

    }
}
