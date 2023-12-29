import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 개수 N
        int count = 0;

        for (int i = 0; i < num; i++) {
            int b = sc.nextInt();
            boolean isPrime = true;

            for (int i2 = 2; i2 <= b/2; i2++) {
                if (b % i2 == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && b>1){
                count++;
            }
        }
        System.out.println(count);
    }
}