import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i <a; i++){
            String b = sc.nextLine();
            System.out.println((i+1)+". "+b);
        }
    }
}
