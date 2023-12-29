import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a == 0 && b == 0 && c == 0) break;
            //else if (Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2)){
            if (c * c == a * a + b * b)  System.out.println("right");
            else if (a * a == c * c + b * b)  System.out.println("right");
            else if (b * b == c * c + a * a)  System.out.println("right");
            else   System.out.println("wrong");
        }
    }
}