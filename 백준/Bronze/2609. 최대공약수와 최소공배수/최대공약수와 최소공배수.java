import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 1,min = a*b;

        while(max !=0){
            max = a % b;
            a = b;
            b = max;
        }
        System.out.println(a+"\n"+min/a);
    }
}
