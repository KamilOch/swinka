
public class inkrementacja{
    public class void main (String[] args){

        int a = 5;
        System.out.println("na poczatku a="+a);
        int b = 3;
        System.out.println("na poczatku b="+b);
        int c = a+b++; //c=a+b, a dopiero później b = b+1;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        c = (a++)+b; //c=a+b, a następnie a = a+1
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);




    }
}
