import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int sum2 =0 ;
        for(int i = 1; i<a+1; i++){
            sum += i;
            sum2 += i*i*i;
        }
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum2);
    }
}