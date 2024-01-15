import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);

       int x = sc.nextInt();
       int n = sc.nextInt();
       int sum = 0;

       for (var i = 0;i<n;i++){
        sum += sc.nextInt() * sc.nextInt();
       }

       if(x==sum) System.out.println("Yes");
       else if(x!=sum) System.out.println("No");

    }
}

