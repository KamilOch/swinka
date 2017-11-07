package it.morfoza.program2_4;

public class Testowanie {
    public static void main (String args[]){
        Test test = new Test();

        System.out.println(test.dodaj(5,10,15));
        System.out.println((test.dodaj(5.0,10.0,15.0)));
    }
}
