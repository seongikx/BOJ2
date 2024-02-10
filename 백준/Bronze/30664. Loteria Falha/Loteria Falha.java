import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            BigInteger a = sc.nextBigInteger();
            if(a.compareTo(BigInteger.valueOf(0))==0) break;
            else if(a.remainder(BigInteger.valueOf(42)).compareTo(BigInteger.valueOf(0)) == 0)System.out.println("PREMIADO");
            else System.out.println("TENTE NOVAMENTE");
        }
    }
}