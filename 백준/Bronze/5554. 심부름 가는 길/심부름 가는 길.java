import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt(); int d = sc.nextInt();

        int hour = (a+b+c+d)/60;
        int min = (a+b+c+d)%60;
        System.out.println(hour+"\n"+min);
    }
}