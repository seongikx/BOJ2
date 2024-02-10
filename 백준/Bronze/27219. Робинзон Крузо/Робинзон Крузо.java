import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a/5;
        int c = a%5;
        for(int i =0; i<b;i++){
            System.out.print("V");
        }
        for(int i =0; i<c;i++){
            System.out.print("I");
        }
    }
}