package it.morfoza.cwiczenia;


//Operatory matematyczne i logiczne
public class Cwiczenie5 {
    public static void main(String[] args) {
        int a =17;
        int b =4;
        int c =a+b; //21
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        int h =17;
        int i =4;
        int j = (h+i)/3; //=7

        System.out.println(j);

        int k =17;
        double l =4.0;
        double m=k/l;

        System.out.println(m);

        int n =5;
        int o =3;
        int p =n+o++;
        int r = (n++)+o;

        System.out.println(p);
        System.out.println(r);

        int s = 5;
        int t = 3;
        boolean prawda = s>t;
        boolean falsz = s<t;
        boolean porownanie = s==t;
        boolean koniunkcja = (s>t)&&(s!=t);

        System.out.println(prawda);
        System.out.println(falsz);
        System.out.println(porownanie);
        System.out.println(koniunkcja);

        String ja = "Sławek";
        String ty = "Sławek";

        boolean porownanie1 = ja==ty; // to miało nie wyjsc a wyszlo!!!!
        boolean porownanie2 = ja.equals(ty); // to miało wyjsc!!!!!!
        System.out.println(porownanie1);
        System.out.println(porownanie2);




    }
}
