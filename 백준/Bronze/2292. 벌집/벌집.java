import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int a = 1;
        int b = 6;
        int cnt=1;

        while(true){
            if(i<=a)break;
            a += b;
            b = b+6;
            cnt++;
        }
        System.out.println(cnt);

    }
}

