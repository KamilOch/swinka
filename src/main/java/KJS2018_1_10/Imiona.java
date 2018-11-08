package KJS2018_1_10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Imiona {
    public static void main(String[] args) {

        String imie;

        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj twoje imię");
        imie = skaner.nextLine();

        if (imie.equals("Kamil")){
            System.out.println("Witaj poniwanie Kamil");
        } else {
            System.out.println("Nie znam ciebie");
        }


    }
}
