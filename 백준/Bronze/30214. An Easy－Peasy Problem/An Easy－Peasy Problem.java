import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        if(a>=b/2) System.out.println("E");
        else System.out.println("H");
    }
}