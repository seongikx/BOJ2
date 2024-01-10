
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        String c = br.readLine();
        StringBuilder d = new StringBuilder("");

        String[] arr = c.split(" ");

        for(var i=0; i<n; i++){
            if(a>Integer.parseInt(arr[i])){
                d.append(arr[i]+" ");
            }
        }
        System.out.println(d);

    }
}

