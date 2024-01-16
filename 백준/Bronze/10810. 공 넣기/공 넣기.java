import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int o = sc.nextInt();

        for(var i =0;i<o;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int m = sc.nextInt();
            for(var y = a-1; y<=b-1;y++){
                arr[y] = m;
            }
        }
        for(var z = 0;z<n;z++) System.out.print(arr[z]+" ");
    }
}