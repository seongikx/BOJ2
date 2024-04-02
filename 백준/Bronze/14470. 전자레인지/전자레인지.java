import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),d = sc.nextInt(),e = sc.nextInt();
        int sec = 0;

        if (a < 0) {
            sec = (a*c*-1)+(b*e)+d;
        } else {
            sec = (b-a)*e;
        }
        System.out.println(sec);
    }
}