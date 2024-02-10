import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = 'S';
        for(int i =0; i<8;i++){
            int a = sc.nextInt();
            if(a == 9) {
                s = 'F';
                break;
            }
        }
        System.out.println(s);
    }
}