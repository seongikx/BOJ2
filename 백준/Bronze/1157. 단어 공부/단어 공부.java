import java.io.*;
import java.util.Scanner;

public class Main {
    public static int[] count(String str){
        int[] countarr = new int[26];
        for(int i=0;i<str.length();i++) countarr[str.charAt(i)-'A']++;
        return countarr ;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();
        int[] countarray = count(str);
        char Maxalp = '?';
        int Maxcount = -1;
        
        for(int i=0;i<26;i++){
            if(countarray[i]>Maxcount){
                Maxalp = (char)(i+'A');
                Maxcount = countarray[i];}
            else if(countarray[i]==Maxcount){
                Maxalp = '?';
            }
        }
        System.out.println(Maxalp);
    }
}