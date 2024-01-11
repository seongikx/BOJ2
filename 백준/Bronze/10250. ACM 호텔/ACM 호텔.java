import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        int t = Integer.parseInt(a);

        for(var i =0;i < t;i++){
            String b= br.readLine();
            String[] arr =b.split(" ");
            int h = Integer.parseInt(arr[0]);
            int w = Integer.parseInt(arr[1]);
            int n = Integer.parseInt(arr[2]);

            int x = 0;
            int y = n%h;

            if((n%h)==0){
                x= n/h;
                y=h;
            }
            else if((n%h)!=0){
                x = (n/h)+1;
            }

            if(x <=9){
                System.out.println(y+"0"+x);
            } else if (x>9) {
                System.out.println(y+""+x);
            }
        }

    }
}

