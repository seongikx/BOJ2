import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(var i =0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d%n",i+1,a,b,a+b);
        }

    }
}