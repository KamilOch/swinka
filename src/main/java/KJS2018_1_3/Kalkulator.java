package KJS2018_1_3;

public class Kalkulator {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        a=2.00;
        b=3.00;
        c=4.2;

        double wynik1 = (a+b)*c;
        System.out.println("(a+b)*c = "+wynik1);

        double wynik2 = a-b/c;
        System.out.println("a-b/c = "+ wynik2);

        a++;
        b++;
        c++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        System.out.println("Czy a+b>c? "+((a+b)>c));
        System.out.println("Czy a=b? "+(a==b));



    }
}
