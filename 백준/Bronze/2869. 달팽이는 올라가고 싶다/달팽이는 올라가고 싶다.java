import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int days = (v - b) / (a - b);
        int remainder = (v - b) % (a - b);

        if (remainder != 0) {
            days++;
        }

        System.out.println(days);
    }
}
