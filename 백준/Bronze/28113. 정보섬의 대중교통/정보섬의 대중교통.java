import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int wait = 0;
        if(n>b) wait = n;
        else if(b>n) wait =b;
        else wait = n;

        if(a<wait) System.out.println("Bus");
        else if(a==wait) System.out.println("Anything");
        else System.out.println("Subway");

    }
}