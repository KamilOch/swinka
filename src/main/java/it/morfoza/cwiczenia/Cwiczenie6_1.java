package it.morfoza.cwiczenia;

//Funkcie matemetyczne i Wielkie Liczby. Praca domowa

import java.math.BigInteger;

import static java.lang.Math.*;

public class Cwiczenie6_1 {
    public static void main (String[] args) {
     int a = -125;
     int b = 325;

    System.out.println(pow(a,b));
    System.out.println(abs(a));
    System.out.println(sqrt(pow(a,b)));

        BigInteger c = new BigInteger("-6123444789");
        BigInteger d = new BigInteger("1234567890");
        BigInteger suma = c.add(d);
        BigInteger roznica = c.subtract(d);
        BigInteger iloczyn = c.multiply(d);
        BigInteger iloraz = c.divide(d);
        BigInteger potega = c.pow(2);


        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);
        System.out.println(potega);
        System.out.println("|a|= "+c.abs());

        // w rozwiazaniu jest bardziej zwiezla forma

        System.out.println("c+d= "+c.add(d).toString());
        System.out.println("c-d= "+c.subtract(d));
        System.out.println("c*d= "+c.multiply(d));
        System.out.println("c/d= "+c.divide(d));
        System.out.println("a^12= "+c.pow(12));
        System.out.println("|a|= "+c.abs());






    }
}
