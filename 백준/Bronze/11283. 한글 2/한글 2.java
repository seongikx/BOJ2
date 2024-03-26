import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int n = Integer.parseInt(br.readLine());
//        n += 44031;
//
//        char res = (char) n;
//
//        System.out.println(res);
        char a = br.readLine().charAt(0);
        int n = (int) a-44031;
        System.out.println(n);
    }
}