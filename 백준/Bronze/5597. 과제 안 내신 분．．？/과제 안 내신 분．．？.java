import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31];
        for(int i=0; i<28;i++) arr[sc.nextInt()]++;
        for(int j=1;j<=30;j++){
            if(arr[j]==0)
            System.out.println(j);
        }
    }
}