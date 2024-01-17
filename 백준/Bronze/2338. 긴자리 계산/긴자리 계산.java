import java.math.BigInteger;
import java.util.Scanner;
// tip: each public class is put in its own file
public class Main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();


        System.out.printf(a.add(b)+"\n"+a.subtract(b)+"\n"+a.multiply(b));
    }
}