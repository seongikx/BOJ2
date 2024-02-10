import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = a.subtract(b).divide(BigInteger.valueOf(2));

        System.out.println(c.add(b)+ " "+ c);

        //짝수일때
//        if(a.remainder(BigInteger.valueOf(2))==BigInteger.valueOf(0))
//            System.out.println(a.divide(BigInteger.valueOf(2)).add(BigInteger.valueOf(1))+" "+a.divide(BigInteger.valueOf(2)).subtract(BigInteger.valueOf(1)));

    }
}