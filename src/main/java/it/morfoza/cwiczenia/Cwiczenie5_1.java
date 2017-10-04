package it.morfoza.cwiczenia;

// Operatory matematyczne praca domowa

public class Cwiczenie5_1 {
    public static void main (String[] args) {
     double a=1;
     double b=2;
     double c=3;

    double d=(a+b)*c;
    System.out.println(d);

    double e=a-b/c;
    System.out.println(e);

    boolean porownanie1 = ((a++)+(b++))>(c++); // TU MI NIE DZIALA!!!!!! Wyglada że ++ wykonywane jest na koncu ( najpierw rownanie a pozniej ++)
    boolean porownanie2 = (a++)==(b++);
    System.out.println(porownanie1);
    System.out.println(porownanie2);

    // jeszcze raz tak samo jak rozwiazanie zadania ( zmiana zmiennych na x y z )

       double x, y, z;
       x = 1.0;
       y = 2.0;
       z = 3.0;

       System.out.println("(x+y)*z= "+((x+y)*z));
       System.out.println("x-y/z= "+(x-y/z));

       x++;
       y++;
       z++;

       System.out.println("(x+y)>z "+((x+y)>z));
       System.out.println("x=y "+(x==y));

    }
}
