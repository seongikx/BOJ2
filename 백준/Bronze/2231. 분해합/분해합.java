import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int realresult = 0;

        for (int i = 0; i < a; i++) {
            int j = i;
            int result = 0;
            while (j != 0) {
                result += j % 10;
                j = j / 10;
            }
            result += i;
            if (result == a) {
                realresult = i;
                break;
            }
        }
        System.out.println(realresult);
    }
}


