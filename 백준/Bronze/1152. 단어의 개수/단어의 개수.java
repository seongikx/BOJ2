

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = a.trim();
//        StringTokenizer st = new StringTokenizer(a);
        String[] arr = b.split(" ");
       int cnt= 0;

        for(var i =0;i<arr.length;i++){
            if(arr[i]!="") cnt++;
            else if(arr[i].isEmpty()) break;}
        System.out.println(cnt);
    }
}

