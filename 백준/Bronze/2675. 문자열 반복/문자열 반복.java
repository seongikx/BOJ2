import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            String c = sc.next();

            for (int o = 0; o < c.length(); o++) {
                for (int p = 0; p < b; p++) {
                    System.out.print(c.charAt(o));
                }
                if(o== c.length()-1){
                    System.out.println();
                }
            }
        }
    }
}
