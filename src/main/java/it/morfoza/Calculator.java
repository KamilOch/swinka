package it.morfoza;

public class Calculator {

    private int liczba1;
    private int liczba2;


    public Calculator (int liczba1, int liczba2) {

        this.liczba1 = liczba1;
        this.liczba2 = liczba2;

    }

    public int getLiczba1() {
        return liczba1;
    }

    public void setLiczba1(int liczba1) {
        this.liczba1 = liczba1;
    }

    public int getLiczba2() {
        return liczba2;
    }

    public void setLiczba2(int liczba2) {
        this.liczba2 = liczba2;
    }

    public int WynikDodawania(int liczba1,int liczba2) {
        return (liczba1 + liczba2);
    }






}
