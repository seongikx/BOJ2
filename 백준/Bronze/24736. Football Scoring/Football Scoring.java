import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<2; i++){
            int a = sc.nextInt()*6;
            int b = sc.nextInt()*3;
            int c = sc.nextInt()*2;
            int d = sc.nextInt()*1;
            int e = sc.nextInt()*2;
            System.out.print(a+b+c+d+e+" ");
        }
    }
}
