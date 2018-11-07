public class Zmienne{
    public static void main(String[]args){

        int liczba; //Deklaracja
        liczba=5; //Inicjalizacja

        char znak='A';

        int liczba1=5;
        int liczba2=liczba1;
        System.out.println(liczba1+liczba2);

        double liczba3, liczba4;
        liczba3 = 5.0;
        liczba4 = 3.3;
        System.out.println(liczba3);
        System.out.println(liczba4);

        int a=5;
        int b=3;
        System.out.println("a+b="+(a+b)); // + sluzy do laczenia stringow


        String hello = "Witaj";
        String world = "Swiecie";
        String powitanie = hello+world; // laczenie stringow
        System.out.println(powitanie);

        String czesc = powitanie.substring(0,6)+"uczniu";
        System.out.println(czesc);



        String wyraz_pierwszy = "A";
        String wyraz_drugi = " kuku";
        String wyraz_trzeci = " parowko";
        String zdanie = wyraz_pierwszy + wyraz_drugi + wyraz_trzeci;
        System.out.println(zdanie);

        String kimjestes = "smaczna "+zdanie.substring(6,14);
        System.out.println(kimjestes);

    }
}