import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    for(int x=1;x<=a;x++){
            System.out.print(" ".repeat(a-x));
            System.out.println("*".repeat(x));
        }
    }
}