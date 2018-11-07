public class cwiczenie{

    public static void main(String []args){

        double a = 17;
        double b = 4;
        double c = 7;

        double w1 = a+b+c;
        System.out.println("wynik dodawania="+w1);
        double w2 = a-b;
        System.out.println("wynik odejmowania="+w2);
        double w3 = b*c;
        System.out.println("wynik mnozenie="+w3);
        double w4 = a/b;
        System.out.println("wynik dzielenie bez reszty="+w4);
        double w5 = a%b;
        System.out.println("wynik  reszta z dzielenia="+w5);
        double w6 = (a+b)*c;
        System.out.println("wynik dodawanie i mnozenie="+w6);
        double w7 = a-b/c;
        System.out.println("wynik odejmowanie dzielenie="+w7);
        double w8;

        // inkrementacja
        w8 = a++;
        w8 = b--;

        System.out.println("inkrementacja a="+a);
        System.out.println("dekrementacja b="+b);
        w8 = a--;
        w8 = b++;

        // test dekrementacja prefixowa

        double w9 = --a/b;
        System.out.println("test jak to dziala chce uzyskac odp = 4 a jest "+w9);
        System.out.println("a po dekrementaci prefixowej =  "+a+" b bez zmian ="+b);

        //Porownania

        Boolean porownanie1 = (a+b)>c;
        System.out.println( "powinna byc prawda  "+porownanie1);

        Boolean porownanie2 = a==b;
        System.out.println( "powinna byc falsz  "+porownanie2);

    }
}