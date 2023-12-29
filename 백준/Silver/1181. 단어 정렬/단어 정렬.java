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
        String[] array = new String[n];

        for(int i=0; i<n; i++ ){
            st = new StringTokenizer(br.readLine());
            array[i] = st.nextToken();
        }
        Arrays.sort(array,
                (a,b) ->{
                    int x = a.length() - b.length();
                    if (x == 0) return a.compareTo(b);
                    return x;});

        sb.append(array[0]).append("\n");

        for(int b=1;b<n;b++){
            if(array[b].equals(array[b - 1])) {
                continue;
            }sb.append(array[b]).append("\n");
        }
        System.out.println(sb);
    }
}

