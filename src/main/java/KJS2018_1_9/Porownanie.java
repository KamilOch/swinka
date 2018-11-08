package KJS2018_1_9;

import java.util.Scanner;

public class Porownanie {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Podaj liczbe a");
        a = skaner.nextInt();

        System.out.println("Podaj liczbe b");
        b = skaner.nextInt();

        if (a>b) {
            System.out.println("a>b");
        } else if (a<b) {
            System.out.println("a<b");
        } else {
            System.out.println("a=b");
        }
    }
}
