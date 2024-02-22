import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int x = c-d;
        int y = c+d;

        if (y < a || b < x) {
            System.out.println("IMPOSSIBLE");
        } else {
            int lowerBound = Math.max(a, x);
            int upperBound = Math.min(b, y);
            int friendCount = upperBound - lowerBound + 1;
            System.out.println(friendCount);
        }
    }
}