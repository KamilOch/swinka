package KJS2018_1_2;

public class Stale {
    public static void main(String[] args) {

        final int finalnyInt = 10;
        final double finalnyDouble = 5.55;

        System.out.println(finalnyInt);
        System.out.println(finalnyDouble);

        String tekst1 = " akuku";
        String tekst2 = " blabla";
        String tekst3 = " lololo";
        String tekst4 = tekst1 + tekst2 + tekst3;

        System.out.println(tekst1);
        System.out.println(tekst2);
        System.out.println(tekst3);
        System.out.println(tekst4);
        System.out.println(tekst4.substring(0,13));




    }
}
