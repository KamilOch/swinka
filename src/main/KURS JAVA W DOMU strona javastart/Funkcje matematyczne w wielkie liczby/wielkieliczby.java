import java.math.BigInteger;

public class wielkieliczby{

    public static void main(String []args){

        BigInteger a = new BigInteger("-123123123123123123123");
        BigInteger b = new BigInteger("98798798987987987987987987");


        System.out.println("suma ="+a.add(b).toString());

        System.out.println("roznica ="+a.subtract(b).toString());

        System.out.println("mnozenie= "+ a.multiply(b).toString());

        System.out.println("dzielenie ="+a.divide(b).toString());

        System.out.println( "potega z a12= "+a.pow(12));

        System.out.println("wartosc absolutna= "+a.abs());

    }
}