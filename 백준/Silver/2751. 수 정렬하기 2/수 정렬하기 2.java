import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = "";
        int[] array = new int[n];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++ ){
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);
        for(int b=0;b<n;b++){
            sb.append(array[b]).append("\n");
        }
        System.out.println(sb);
    }
}