import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //숫자의 개수
        String b = sc.next(); // 입력받는 숫자
        char c = ' ';
        int sum = 0;

        for(int i=0;i<a;i++){
            c = b.charAt(i);
            int d = c - '0';
            sum += d;
        }
        System.out.println(sum);

    }
}