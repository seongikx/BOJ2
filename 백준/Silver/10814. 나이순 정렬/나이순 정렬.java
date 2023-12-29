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

        String[][] arr = new String[n][2];

        for(int i=0; i<n; i++ ){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        Arrays.sort(arr,
                (a, b) -> {
                int y = Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
                return y;});

        for(int b=0;b<n;b++){
            sb.append(arr[b][0]+" "+arr[b][1]).append("\n");
        }
        System.out.println(sb);
    }
}

