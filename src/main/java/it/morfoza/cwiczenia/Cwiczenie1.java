import java.util.Scanner;

public class Cwiczenie1{
    public static void main(String[] args){
        double a;
        double b;

        Scanner odczyt = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        a = odczyt.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        b = odczyt.nextDouble();

        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+(a/b));
    }
}