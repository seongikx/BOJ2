import java.io.*;
import java.util.Scanner;

public class Main {
    public static int[] count(String str){
        int[] countarr = new int[26];
        for(int i=0;i<str.length();i++){
            countarr[str.charAt(i)-'a']++;
        }
        return countarr ;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        int ans = 0;

        int[] countA = count(a);
        int[] countB = count(b);

        for(int i=0;i<26;i++){
            ans += Math.abs(countA[i]-countB[i]);
        }
        System.out.println(ans);
    }
}