package KJS2018_1_5;

import java.math.BigInteger;


public class Kalk {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("-40000056844685684643848");
        BigInteger b = new BigInteger("168468431234165468468");

        System.out.println("a+b = "+a.add(b).toString());
        System.out.println("a-b = "+a.subtract(b).toString());
        System.out.println("a*b = "+a.multiply(b).toString());
        System.out.println("a/b = "+a.divide(b).toString());
        System.out.println(" ");
        System.out.println("a^12= "+a.pow(12));
        System.out.println("|a|= "+a.abs());





    }
}
