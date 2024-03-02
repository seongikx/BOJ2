import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

        int n = a*3600+b*60+c;
        d +=n;
        a = (d/3600)%24;
        b = (d/60)%60;
        c = d%60;
        System.out.println(a+" "+b+" "+c);

    }
}