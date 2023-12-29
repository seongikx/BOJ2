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

        while(true){
            String str = sc.next();
            if(str.equals("0"))break;
            boolean check = true;

            for(int i=0;i<str.length()/2;i++){
                if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                    check = false ;
                }
            }
            System.out.println(check ? "yes" : "no");
        }


    }
}

