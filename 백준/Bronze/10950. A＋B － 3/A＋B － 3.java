import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int result = 0;
    for(int x=0;x<a;x++){
            int b = sc.nextInt();
            int c = sc.nextInt();
             result = b+c;
             System.out.println(result);
        }
    }
}