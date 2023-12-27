import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        while(sc.hasNext()){
                int b = sc.nextInt();
                int c = sc.nextInt();
                if(b == 0 && c ==0)break;
                result = b + c;
                System.out.println(result);
        }
    }
}