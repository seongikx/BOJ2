import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String str = "";
        int[][] array = new int[n][2];

        for(int i=0; i<n; i++ ){
            st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array,
                (a, b) -> {
                int y = a[0] - b[0];
                if (y != 0) return y;
                int x = a[1] - b[1];
                return x;});

        for(int b=0;b<n;b++){
            sb.append(array[b][0]+" "+array[b][1]).append("\n");
        }
        System.out.println(sb);
    }
}

