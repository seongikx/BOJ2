import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i =0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int check = sc.nextInt();
        int point = 0;
        for(int y = 0; y <num; y++){
            if(check == arr[y]) point++;
        }
        System.out.println(point);
    }
}